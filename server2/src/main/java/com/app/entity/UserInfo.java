package com.app.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Package ${PACKAGE_NAME}
 * @ClassName  ${NAME}
 * @Author shaobin.wang
 * @Date  2019/07/25 11:10
 * @Version 1.0
 * @Description:  
 **/
@Data
public class UserInfo implements Serializable {
    private Long id;

    private String userName;

    private static final long serialVersionUID = 1L;

}