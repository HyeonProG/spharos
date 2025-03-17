package com.hj.hyeonjae.category.domain;

import jakarta.persistence.*;

@Entity
public class CategoryBottom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;

    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryMiddle categoryMiddle;

}
