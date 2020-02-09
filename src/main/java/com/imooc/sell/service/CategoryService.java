package com.imooc.sell.service;

import com.imooc.sell.dataObject.ProductCategory;

import java.util.List;

/**
 * \* User: lohvc
 * \* Date: 2020/2/6
 * \* Time: 15:11
 * \
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
