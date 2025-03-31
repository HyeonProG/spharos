package com.unionclass.spharos6th.product.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProductOptionList is a Querydsl query type for ProductOptionList
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductOptionList extends EntityPathBase<ProductOptionList> {

    private static final long serialVersionUID = -675669693L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProductOptionList productOptionList = new QProductOptionList("productOptionList");

    public final com.unionclass.spharos6th.color.domain.QColor color;

    public final NumberPath<Integer> dangerStock = createNumber("dangerStock", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QProduct product;

    public final com.unionclass.spharos6th.size.domain.QSize size;

    public final BooleanPath soldOut = createBoolean("soldOut");

    public final NumberPath<Integer> stock = createNumber("stock", Integer.class);

    public QProductOptionList(String variable) {
        this(ProductOptionList.class, forVariable(variable), INITS);
    }

    public QProductOptionList(Path<? extends ProductOptionList> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProductOptionList(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProductOptionList(PathMetadata metadata, PathInits inits) {
        this(ProductOptionList.class, metadata, inits);
    }

    public QProductOptionList(Class<? extends ProductOptionList> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.color = inits.isInitialized("color") ? new com.unionclass.spharos6th.color.domain.QColor(forProperty("color")) : null;
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product")) : null;
        this.size = inits.isInitialized("size") ? new com.unionclass.spharos6th.size.domain.QSize(forProperty("size")) : null;
    }

}

