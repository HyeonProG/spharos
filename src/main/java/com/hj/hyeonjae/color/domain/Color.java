package com.hj.hyeonjae.color.domain;

import com.hj.hyeonjae.product.domain.Product;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
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
