package com.unionclass.spharos6th.product.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productCode;
    private String productName;
    private Double price;
    private String productDescription;

    @Lob
    @Column(nullable = false, columnDefinition = "TEXT")
    private String productDetailContent;

    @Builder
    public Product(String productCode, String productName, Double price, String productDescription, String productDetailContent) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.productDetailContent = productDetailContent;
    }

}
