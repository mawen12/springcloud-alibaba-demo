package com.mawen.cloudalibaba.user.controller;

import com.mawen.cloudalibaba.user.constant.AppConstant;
import com.mawen.cloudalibaba.user.tool.api.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author mawen
 * @create 2022-01-18 10:52
 */
@RestController
@RequestMapping("/api/" + AppConstant.APPLICATION_USER_NAME)
public class UserController {

    @GetMapping("/detail")
    public R<Long> detail(Long userId) {
        return R.data(userId);
    }

}
