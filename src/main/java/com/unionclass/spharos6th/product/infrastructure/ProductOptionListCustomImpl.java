package com.unionclass.spharos6th.product.infrastructure;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.unionclass.spharos6th.common.utils.CursorPage;
import com.unionclass.spharos6th.product.domain.ProductOptionList;
import com.unionclass.spharos6th.product.domain.QProductOptionList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ProductOptionListCustomImpl implements ProductOptionListCustomRepository {

    private static final int DEFAULT_PAGE_SIZE = 20;
    private static final int DEFAULT_PAGE_NUMBER = 0;

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public CursorPage<ProductOptionList> getProductOptionListByOptions(
            String productCode,
            Long sizeId,
            Long colorId,
            Long lastId,
            Integer pageSize,
            Integer page
    ) {

        QProductOptionList productOptionList = QProductOptionList.productOptionList;
        BooleanBuilder builder = new BooleanBuilder();
        Optional.ofNullable(sizeId).ifPresent(
                id -> builder.and(productOptionList.size.id.eq(sizeId))
        );
        Optional.ofNullable(colorId).ifPresent(
                id -> builder.and(productOptionList.color.id.eq(colorId))
        );
        Optional.ofNullable(productCode).ifPresent(
                code -> builder.and(productOptionList.product.productCode.eq(code))
        );

        int currentPageSize = Optional.ofNullable(pageSize).orElse(DEFAULT_PAGE_SIZE);
        int offset = 0;

        if(lastId != null) {
            builder.and(productOptionList.id.lt(lastId));
        } else {
            int currentPage = Optional.ofNullable(page).orElse(DEFAULT_PAGE_NUMBER);
            offset = currentPage == 0 ? 0 : (currentPage - 1) * currentPageSize;
        }

        List<ProductOptionList> getContent = jpaQueryFactory
                .selectFrom(productOptionList)
                .where(builder)
                .offset(offset)
                .limit(currentPageSize + 1)
                .orderBy(productOptionList.id.desc())
                .fetch();

        Long nextCursor = null;
        boolean hasNext = false;

        if (getContent.size() > currentPageSize) {
            hasNext = true;
            getContent = getContent.subList(0, currentPageSize);
            nextCursor = getContent.get(getContent.size() - 1).getId();
        }

        return CursorPage.<ProductOptionList>builder()
                .content(getContent)
                .nextCursor(nextCursor)
                .hasNext(hasNext)
                .pageSize(currentPageSize)
                .page(page)
                .build();
    }

}
