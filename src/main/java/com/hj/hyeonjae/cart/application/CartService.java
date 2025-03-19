package com.hj.hyeonjae.cart.application;

import com.hj.hyeonjae.cart.dto.in.RequestCartDTO;
import com.hj.hyeonjae.cart.dto.out.ResponseCartDTO;

import java.util.List;

public interface CartService {

    void addCart(RequestCartDTO requestCartDTO);

    void deleteCart(String cartUUID);

    Boolean checkCart(String cartUUID);

    void changeProductCount();

    void changeProductOption();

    List<ResponseCartDTO> getCartList(String userUUID);

    ResponseCartDTO getCart(String cartUUID);

}
