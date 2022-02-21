package com.mawen.cloudalibaba.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 主启动类
 *
 * @author mawen
 * @create 2022-01-18 10:51
 */
@SpringCloudApplication
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
