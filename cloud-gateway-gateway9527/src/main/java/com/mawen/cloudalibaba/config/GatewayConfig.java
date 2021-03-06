package com.mawen.cloudalibaba.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 网关配置-编码实现
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route_guonei", r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei"))
                .route("path_rout_guoji", r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji"))
                .build();
    }

}
