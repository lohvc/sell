package com.imooc.sell.repository;

import com.imooc.sell.dataObject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * \* User: lohvc
 * \* Date: 2020/2/6
 * \* Time: 12:02
 * \
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
