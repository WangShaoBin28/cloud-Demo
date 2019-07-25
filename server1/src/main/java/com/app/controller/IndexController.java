package com.app.controller;

import com.app.entity.UserInfo;
import com.app.feignServer.Server2Feign;
import com.app.service.UserInfoService;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package com.app.controller
 * @ClassName IndexController
 * @Author shaobin.wang
 * @Date 2019/07/25 11:10
 * @Version 1.0
 * @Description:
 **/
@RestController
public class IndexController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/save")
    public String save() {

        //回滚
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("测试！！！！");
        String save = userInfoService.save(userInfo, 1);

//        UserInfo userInfo2 = new UserInfo();
//        userInfo2.setUserName("测试22222！！！！");
//        userInfoService.save(userInfo, 2);

        return save;
    }


}
