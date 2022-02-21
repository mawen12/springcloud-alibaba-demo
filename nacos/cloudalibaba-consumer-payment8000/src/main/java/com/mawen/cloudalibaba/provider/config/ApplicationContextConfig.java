package com.mawen.cloudalibaba.provider.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 应用配置
 *
 * @author mawen
 * @create 2022-01-10 22:06
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 使用@LoadBalanced，才能正确访问到Nacos中的服务
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
