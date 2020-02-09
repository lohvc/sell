package com.imooc.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * \* User: lohvc
 * \* Date: 2020/2/8
 * \* Time: 12:11
 * \
 */
@Data
public class OrderForm {

    @NotEmpty(message = "姓名必填")
    private String name;

    @NotEmpty(message = "手机号必填")
    private String phone;

    @NotEmpty(message = "地址必填")
    private String address;

    @NotEmpty(message = "微信号必填")
    private String openid;

    @NotEmpty(message = "地址必填")
    private String items;




}
