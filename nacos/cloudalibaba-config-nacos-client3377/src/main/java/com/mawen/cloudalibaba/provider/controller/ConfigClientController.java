package com.mawen.cloudalibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付
 *
 * @author mawen
 * @create 2022-01-10 21:17
 */
@RefreshScope // 支持Nacos的动态刷新
@RestController
@RequestMapping("/api/config")
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/nacos")
    public String getConfigInfo() {
        return configInfo;
    }

}
