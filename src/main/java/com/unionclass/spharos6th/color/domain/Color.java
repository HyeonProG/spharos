package com.unionclass.spharos6th.color.domain;

import com.unionclass.spharos6th.product.domain.Product;
import jakarta.persistence.*;


@Entity
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String colorName;
    private String colorCode;
    private String colorDescription;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Product product;
//    private Long productId;
}
