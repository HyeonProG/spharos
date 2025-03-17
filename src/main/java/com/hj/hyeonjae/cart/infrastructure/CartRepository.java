package com.hj.hyeonjae.cart.infrastructure;

import com.hj.hyeonjae.cart.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Optional<Cart> findByCartUUID(String cartUUID);

    List<Cart> findByUserUUID(String userUUID);

}
