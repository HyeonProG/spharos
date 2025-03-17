package com.hj.hyeonjae.cart.application;

public interface CartService {

    void addCart(RequestCartDTO requestCartDTO);

    void deleteCart(String cartUUID);

    Boolean checkCart(String cartUUID);

    void changeProductCount();

    void changeProductOption();

    List<ResponseCartDTO> getCartList(String userUUID);

    ResponseCartDTO getCart(String cartUUID);

}
