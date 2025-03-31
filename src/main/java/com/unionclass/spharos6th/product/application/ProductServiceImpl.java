package com.unionclass.spharos6th.product.application;

import com.unionclass.spharos6th.common.specification.ProductSpecification;
import com.unionclass.spharos6th.product.domain.Product;
import com.unionclass.spharos6th.product.infrastructure.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    @Override
    public List<Product> getProductListWithPrice(Double minPrice, Double maxPrice) {
        Specification<Product> spec = ProductSpecification.withPrice(minPrice, maxPrice);
        return productRepository.findAll(spec);
    }
}
