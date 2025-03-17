package com.hj.hyeonjae.product.domain;

import com.hj.hyeonjae.color.domain.Color;
import com.hj.hyeonjae.size.domain.Size;
import jakarta.persistence.*;

@Entity
public class ProductOptionList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    private Color color;

    @ManyToOne(fetch = FetchType.LAZY)
    private Size size;

}
