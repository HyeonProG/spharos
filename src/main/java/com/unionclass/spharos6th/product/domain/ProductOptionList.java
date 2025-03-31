package com.unionclass.spharos6th.product.domain;

import com.unionclass.spharos6th.color.domain.Color;
import com.unionclass.spharos6th.size.domain.Size;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class ProductOptionList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer stock;
    private Boolean soldOut;
    private Integer dangerStock;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
    @ManyToOne(fetch = FetchType.LAZY)
    private Color color;
    @ManyToOne(fetch = FetchType.LAZY)
    private Size size;


}