package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * \* User: lohvc
 * \* Date: 2020/2/8
 * \* Time: 20:02
 * \
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
