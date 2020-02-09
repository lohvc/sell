package com.imooc.sell.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DecimalFormat;

/**
 * \* User: lohvc
 * \* Date: 2020/2/6
 * \* Time: 16:02
 * \
 */
@Data
@Entity
public class ProductInfo {

    @Id
    private  String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Integer categoryType;

    private Integer productStatus;

}
