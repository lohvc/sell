package com.imooc.sell.dataObject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * \* User: lohvc
 * \* Date: 2020/2/6
 * \* Time: 11:54
 *
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    /*类目id*/
    @Id
    @GeneratedValue
    private Integer categoryId;
    /*类目名字*/
    private String categoryName;
    /*类目编号*/
    private Integer categoryType;

//    private Timestamp createTime;
//
//    private Timestamp updateTime;



    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory(){

    }
}
