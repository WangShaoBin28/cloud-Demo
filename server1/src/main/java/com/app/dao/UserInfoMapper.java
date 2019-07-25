package com.app.dao;

import com.app.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Package ${PACKAGE_NAME}
 * @ClassName ${NAME}
 * @Author shaobin.wang
 * @Date 2019/07/25 11:09
 * @Version 1.0
 * @Description:
 **/
@Mapper
@Repository
public interface UserInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}