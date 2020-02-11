package com.imooc.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * \* User: lohvc
 * \* Date: 2020/2/10
 * \* Time: 19:33
 * \
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {
    private String mpAppId;

    private String mpAppSecret;
}
