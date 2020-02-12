package com.imooc.sell.dataObject;

import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.core.annotation.Order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * \* User: lohvc
 * \* Date: 2020/2/6
 * \* Time: 21:47
 * \
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    /*订单id*/
    @Id
    //@GeneratedValue
    private String orderId;

    /*买家名字*/
    private String buyerName;

    /*买家地址*/
    private String buyerAddress;

    private String buyerPhone;

    /*买家微信openid*/
    private String buyerOpenid;

    /*订单总金额*/
    private BigDecimal orderAmount;

    /*订单状态，默认为新下单*/
    private Integer orderStatus= OrderStatusEnum.NEW.getCode();

    /*支付状态，默认未支付*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

//    /*创建时间*/
//    private Date createTime;
//
//    /*更新时间*/
//    private Date updateTime;

}
