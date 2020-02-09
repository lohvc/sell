package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.imooc.sell.dataObject.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * 商品 包含类目
 * \* User: lohvc
 * \* Date: 2020/2/6
 * \* Time: 19:07
 * \
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
