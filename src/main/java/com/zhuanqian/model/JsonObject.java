package com.zhuanqian.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/8.
 */
public class JsonObject implements Serializable{
    private String name;
    private String password;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
