package com.unionclass.spharos6th.product.infrastructure;

import com.unionclass.spharos6th.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
