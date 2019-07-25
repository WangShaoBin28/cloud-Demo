package com.app.controller;

import com.app.dao.UserInfoMapper;
import com.app.entity.UserInfo;
import com.app.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package com.app.controller
 * @ClassName IndexController
 * @Author shaobin.wang
 * @Date 2019/07/25 11:22
 * @Version 1.0
 * @Description:
 **/
@RestController
public class IndexController {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/save")
    public String save(@RequestBody UserInfo userInfo, @RequestParam("i") Integer i) {
        System.out.println(userInfo);
        userInfoService.insert(userInfo,i);
        return "ok";
    }
}
