package com.app.service;

import com.app.entity.UserInfo;
    /**
 * @Package ${PACKAGE_NAME}
 * @ClassName  ${NAME}
 * @Author shaobin.wang
 * @Date  2019/07/25 11:10
 * @Version 1.0
 * @Description:  
 **/
public interface UserInfoService{


    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record, Integer i);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

}
