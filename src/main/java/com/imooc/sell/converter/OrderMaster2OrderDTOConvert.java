package com.imooc.sell.converter;

import com.imooc.sell.dataObject.OrderMaster;
import com.imooc.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * \* User: lohvc
 * \* Date: 2020/2/7
 * \* Time: 20:42
 * \
 */
public class OrderMaster2OrderDTOConvert {
    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO=new OrderDTO();

        BeanUtils.copyProperties(orderMaster,orderDTO);

        return orderDTO;

    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
        return orderMasterList.stream().map(e ->convert(e)).collect(Collectors.toList());
    }
}
