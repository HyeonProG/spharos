package com.unionclass.spharos6th.cart.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cartUuid;
    private String userUuid;
    private String productCode;
    private String productOptionId;
    private Integer productCount;
    private Boolean checked;
    private Boolean deleted;

    @Builder
    public Cart(
            Long id,
            String cartUuid,
            String userUuid,
            String productCode,
            String productOptionId,
            Integer productCount,
            Boolean checked,
            Boolean deleted
    ) {
        this.id = id;
        this.cartUuid = cartUuid;
        this.userUuid = userUuid;
        this.productCode = productCode;
        this.productOptionId = productOptionId;
        this.productCount = productCount;
        this.checked = checked;
        this.deleted = deleted;
    }

}
