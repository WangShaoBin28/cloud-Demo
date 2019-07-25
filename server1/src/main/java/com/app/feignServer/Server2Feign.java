package com.app.feignServer;

import com.app.entity.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @Package com.app.feignServer
 * @ClassName Server2Feign
 * @Author shaobin.wang
 * @Date 2019/07/25 11:19
 * @Version 1.0
 * @Description:
 **/
@FeignClient(value = "server2", fallback = Server2Hystrix.class)
public interface Server2Feign {


    @PostMapping("/save")
    String save(@RequestBody UserInfo userInfo, @RequestParam("i") Integer i);
}
