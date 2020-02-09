package com.imooc.sell.utils;

import java.util.Random;

/**
 * \* User: lohvc
 * \* Date: 2020/2/7
 * \* Time: 16:25
 * \
 */
public class KeyUtil {
    /*
    * 生成唯一的主键
    *
    * */
    public static synchronized String genUniqueKey(){
        Random random=new Random();
        Integer number=random.nextInt(900000)+100000;

        return System.currentTimeMillis()+String.valueOf(number);
    }
}
