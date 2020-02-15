package com.imooc.sell.utils;

import com.imooc.sell.enums.CodeEnum;

/**
 * \* User: lohvc
 * \* Date: 2020/2/15
 * \* Time: 11:44
 * \
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each:enumClass.getEnumConstants()){
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
