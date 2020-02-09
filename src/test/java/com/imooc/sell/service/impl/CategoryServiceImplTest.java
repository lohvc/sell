package com.imooc.sell.service.impl;

import com.imooc.sell.dataObject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory=categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategories=categoryService.findAll();
        Assert.assertNotEquals(0,productCategories.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList=categoryService.findByCategoryTypeIn(Arrays.asList(2));
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory=new ProductCategory("男生专享",3);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);


    }
}
