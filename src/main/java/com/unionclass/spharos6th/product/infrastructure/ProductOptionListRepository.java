package com.unionclass.spharos6th.product.infrastructure;

import com.unionclass.spharos6th.product.domain.ProductOptionList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductOptionListRepository extends JpaRepository<ProductOptionList, Long> {

    List<ProductOptionList> findAllBySizeId(Long sizeId);
    List<ProductOptionList> findAllByColorId(Long colorId);
    List<ProductOptionList> findAllBySizeIdAndColorId(Long sizeId, Long colorId);

}
