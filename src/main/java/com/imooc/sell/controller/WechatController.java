package com.imooc.sell.controller;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* User: lohvc
 * \* Date: 2020/2/8
 * \* Time: 22:26
 * \
 */
@RestController
@RequestMapping("/wechat")
@Slf4j
public class WechatController {
    @GetMapping("/authorize")
    public void authorize(@RequestParam("returnUrl") String returnUrl){
        WxMpService wxMpService=new WxMpServiceImpl();

    }
}
