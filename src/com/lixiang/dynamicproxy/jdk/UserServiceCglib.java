package com.lixiang.dynamicproxy.jdk;

/**
 * Created by Administrator on 2017/8/24 0024.
 */
public class UserServiceCglib {
    public String getName(int id) {
        System.out.println("------getName_cglib------");
        return "Tom";
    }

    public Integer getAge(int id) {
        System.out.println("------getAge_cglib------");
        return id;
    }
}
