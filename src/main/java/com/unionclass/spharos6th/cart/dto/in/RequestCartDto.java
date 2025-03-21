package com.unionclass.spharos6th.cart.dto.in;

import com.unionclass.spharos6th.cart.domain.Cart;
import com.unionclass.spharos6th.cart.vo.RequestCartVo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@ToString
@Getter
@NoArgsConstructor
public class RequestCartDto {

    private String userUuid;
    private String productCode;
    private String productOptionId;
    private Integer productCount;
    private Boolean checked;

    @Builder
    public RequestCartDto(
            String userUuid,
            String productCode,
            String productOptionId,
            Integer productCount,
            Boolean checked) {
        this.userUuid = userUuid;
        this.productCode = productCode;
        this.productOptionId = productOptionId;
        this.productCount = productCount;
        this.checked = checked;
    }

    public Cart toEntity(){
        return Cart.builder()
                .cartUuid(UUID.randomUUID().toString())
                .userUuid(userUuid)
                .productCode(productCode)
                .productOptionId(productOptionId)
                .productCount(productCount)
                .checked(checked)
                .build();
    }

    public Cart updateEntity(Cart cart){
        return Cart.builder()
                .id(cart.getId())
                .cartUuid(cart.getCartUuid())
                .userUuid(userUuid)
                .productCode(productCode)
                .productOptionId(productOptionId)
                .productCount(productCount)
                .checked(checked)
                .build();
    }

    public static RequestCartDto from(RequestCartVo requestCartVo){
        return RequestCartDto.builder()
                .userUuid(requestCartVo.getUserUuid())
                .productCode(requestCartVo.getProductCode())
                .productOptionId(requestCartVo.getProductOptionId())
                .productCount(requestCartVo.getProductCount())
                .checked(requestCartVo.getChecked())
                .build();
    }


}
