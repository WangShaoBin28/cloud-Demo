package com.app.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.app.entity.UserInfo;
import com.app.dao.UserInfoMapper;
import com.app.service.UserInfoService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Package ${PACKAGE_NAME}
 * @ClassName ${NAME}
 * @Author shaobin.wang
 * @Date 2019/07/25 11:10
 * @Version 1.0
 * @Description:
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    @LcnTransaction //分布式事务
    public int insert(UserInfo record, Integer i) {
        if (i == 2) {
            int aa = 0;
            aa = aa / 0;
        }
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

}
