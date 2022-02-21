package com.mawen.cloudalibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付
 *
 * @author mawen
 * @create 2022-01-10 21:17
 */
@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/nacos/{id}")
    public String getPayment(@PathVariable Integer id) {
        return "nacos registry, serverPort: " + serverPort + ", id" + id;
    }

}
