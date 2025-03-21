package com.unionclass.spharos6th.cart.application;

import com.unionclass.spharos6th.cart.domain.Cart;
import com.unionclass.spharos6th.cart.dto.in.RequestCartDto;
import com.unionclass.spharos6th.cart.dto.out.ResponseCartDto;

import java.util.List;

public interface CartService {

    void addCart(RequestCartDto requestCartDto);
    void deleteCart(String cartUuid);
    Boolean checkCart(String cartUuid);
    void changeProductCount();
    void changeProductOption();
    ResponseCartDto getCart(String cartUuid);
    List<ResponseCartDto> getCartList(String userUuid);

}
