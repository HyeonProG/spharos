package com.hj.hyeonjae.cart.vo;

import lombok.Getter;

@Getter
public class RequestCartVO {

    String userUUID;

    String productCode;

    String productOptionId;

    Integer productCount;

    Boolean checked;

}
