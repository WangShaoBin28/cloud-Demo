package com.app.feignServer;

import com.app.entity.UserInfo;
import org.springframework.stereotype.Component;

/**
 * @Package com.app.feignServer
 * @ClassName Server2Hystrix
 * @Author shaobin.wang
 * @Date 2019/07/25 11:20
 * @Version 1.0
 * @Description:
 **/
@Component
public class Server2Hystrix implements Server2Feign {

    @Override
    public String save(UserInfo userInfo, Integer i) {

        return "失败";
    }
}
