package com.unionclass.spharos6th.product.application;

import com.unionclass.spharos6th.product.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductListWithPrice(Double minPrice, Double maxPrice);
}
