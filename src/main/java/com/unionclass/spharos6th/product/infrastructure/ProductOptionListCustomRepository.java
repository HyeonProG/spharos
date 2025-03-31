package com.unionclass.spharos6th.product.infrastructure;

import com.unionclass.spharos6th.common.utils.CursorPage;
import com.unionclass.spharos6th.product.domain.ProductOptionList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductOptionListCustomRepository {

    CursorPage<ProductOptionList> getProductOptionListByOptions(
            String productCode,
            Long sizeId,
            Long colorId,
            Long lastId,
            Integer pageSize,
            Integer page
    );

}
