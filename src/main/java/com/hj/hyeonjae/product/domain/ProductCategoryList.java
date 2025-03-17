package com.hj.hyeonjae.product.domain;

import com.hj.hyeonjae.category.domain.CategoryBottom;
import com.hj.hyeonjae.category.domain.CategoryMiddle;
import com.hj.hyeonjae.category.domain.CategoryTop;
import jakarta.persistence.*;

@Entity
public class ProductCategoryList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private CategoryTop categoryTop;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private CategoryMiddle categoryMiddle;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private CategoryBottom categoryBottom;

    private Long categoryTopId;

    private Long categoryMiddleId;

    private Long categoryBottomId;

}
