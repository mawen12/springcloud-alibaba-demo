package com.mawen.cloudalibaba.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 订单
 *
 * @author mawen
 * @create 2022-01-10 21:17
 */
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/nacos/{id}")
    public String getPayment(@PathVariable Integer id) {
        return restTemplate.getForObject(serverUrl + "/api/payment/nacos/" + id, String.class);
    }

}
