package com.unionclass.spharos6th.cart.vo;

import lombok.Getter;

@Getter
public class RequestCartVo {

    private String userUuid;
    private String productCode;
    private String productOptionId;
    private Integer productCount;
    private Boolean checked;

}
