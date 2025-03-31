package com.unionclass.spharos6th.cart.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCart is a Querydsl query type for Cart
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCart extends EntityPathBase<Cart> {

    private static final long serialVersionUID = 815332168L;

    public static final QCart cart = new QCart("cart");

    public final StringPath cartUuid = createString("cartUuid");

    public final BooleanPath checked = createBoolean("checked");

    public final BooleanPath deleted = createBoolean("deleted");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath productCode = createString("productCode");

    public final NumberPath<Integer> productCount = createNumber("productCount", Integer.class);

    public final StringPath productOptionId = createString("productOptionId");

    public final StringPath userUuid = createString("userUuid");

    public QCart(String variable) {
        super(Cart.class, forVariable(variable));
    }

    public QCart(Path<? extends Cart> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCart(PathMetadata metadata) {
        super(Cart.class, metadata);
    }

}

