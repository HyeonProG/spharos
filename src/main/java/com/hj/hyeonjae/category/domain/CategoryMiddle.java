package com.hj.hyeonjae.category.domain;

import jakarta.persistence.*;

@Entity
public class CategoryMiddle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;

    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryTop categoryTop;

}
