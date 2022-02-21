package com.mawen.cloudalibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author mawen
 * @create 2022-01-12 22:11
 */
@RestController
@RequestMapping("/api/flow")
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        try {
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "---------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "---------testB";
    }

}
