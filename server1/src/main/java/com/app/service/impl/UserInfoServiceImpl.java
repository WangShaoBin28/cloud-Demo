package com.app.service.impl;

import com.app.dao.UserInfoMapper;
import com.app.entity.UserInfo;
import com.app.feignServer.Server2Feign;
import com.app.service.UserInfoService;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Package ${PACKAGE_NAME}
 * @ClassName ${NAME}
 * @Author shaobin.wang
 * @Date 2019/07/25 11:08
 * @Version 1.0
 * @Description:
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;
    @Autowired
    private Server2Feign server2Feign;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserInfo record) {
        return userInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(UserInfo record) {
        return userInfoMapper.insertSelective(record);
    }

    @Override
    public UserInfo selectByPrimaryKey(Long id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return userInfoMapper.updateByPrimaryKey(record);
    }


    @Override
    @Transactional
    @LcnTransaction
    public String save(UserInfo userInfo, int i) {
        //调用服务
        String save = server2Feign.save(userInfo, 1);


        String save2 = server2Feign.save(userInfo, 2);

        if (!save2.equals("ok")) {
            throw new RuntimeException("new Exception");
        }
        //本地保存
        UserInfo userInfo1 = new UserInfo();
        userInfo1.setUserName("本地本地");
        int insert = userInfoMapper.insert(userInfo1);


        return "ok";
    }

}

