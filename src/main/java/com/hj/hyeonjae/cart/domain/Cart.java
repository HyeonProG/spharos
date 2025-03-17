package com.hj.hyeonjae.cart.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cartUUID;

    private String userUUID;

    private String productCode;

    private String productOptionId;

    private Integer productCount;

    private Boolean checked;

    private Boolean deleted;

    @Builder

    public Cart(Long id, String cartUUID, String userUUID, String productCode, String productOptionId, Integer productCount, Boolean checked, Boolean deleted) {
        this.id = id;
        this.cartUUID = cartUUID;
        this.userUUID = userUUID;
        this.productCode = productCode;
        this.productOptionId = productOptionId;
        this.productCount = productCount;
        this.checked = checked;
        this.deleted = deleted;
    }
}
