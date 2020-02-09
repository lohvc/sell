package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * \* User: lohvc
 * \* Date: 2020/2/7
 * \* Time: 14:21
 * \
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code=resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super((message));

        this.code=code;
    }
}
