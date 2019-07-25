package com.app.entity;

import java.io.Serializable;

/**
 * @Package ${PACKAGE_NAME}
 * @ClassName ${NAME}
 * @Author shaobin.wang
 * @Date 2019/07/25 11:09
 * @Version 1.0
 * @Description:
 **/
public class UserInfo implements Serializable {
    private Long id;

    private String userName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}