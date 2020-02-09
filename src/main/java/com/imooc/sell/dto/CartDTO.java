package com.imooc.sell.dto;

import lombok.Data;

/**
 *
 * 购物车
 * \* User: lohvc
 * \* Date: 2020/2/7
 * \* Time: 17:04
 * \
 */
@Data
public class CartDTO {
    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
