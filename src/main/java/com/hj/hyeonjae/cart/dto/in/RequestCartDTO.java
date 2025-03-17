package com.hj.hyeonjae.cart.dto.in;

import com.hj.hyeonjae.cart.domain.Cart;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class RequestCartDTO {

    private String userUUID;

    private String productCode;

    private String productOptionId;

    private Integer productCount;

    private Boolean checked;

    @Builder
    public RequestCartDTO(String userUUID, String productCode, String productOptionId, Integer productCount,
                          Boolean checked) {
        this.userUUID = userUUID;
        this.productCode = productCode;
        this.productOptionId = productOptionId;
        this.productCount = productCount;
        this.checked = checked;
    }

    public Cart toEntity() {
        return Cart.builder()
                .userUUID(userUUID)
                .productCode(productCode)
                .productOptionId(productOptionId)
                .productCount(productCount)
                .checked(checked)
                .build();
    }

    public Cart updateCartEntity(Cart cart) {
        return Cart.builder()
                .id(cart.getId())
                .cartUUID(cart.getCartUUID())
                .userUUID(userUUID)
                .productCode(productCode)
                .productOptionId(productOptionId)
                .productCount(productCount)
                .checked(checked)
                .build();
    }

    public static RequestCartDTO from(RequestCartVO requestCartVO) {
        return RequestCartDTO.builder()
               .userUUID(requestCartVO.getUserUUID())
               .productCode(requestCartVO.getProductCode())
               .productOptionId(requestCartVO.getProductOptionId())
               .productCount(requestCartVO.getProductCount())
               .checked(requestCartVO.getChecked())
               .build();
    }

}
