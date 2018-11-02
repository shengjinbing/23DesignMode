package com.lixiang.dynamicproxy.jdk;

/**
 * Created by Administrator on 2017/8/24 0024.
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getName(int id) {
        System.out.println("------getName------");
        return "Tom";
    }

    @Override
    public Integer getAge(int id) {
        System.out.println("------getAge------");
        return 10;
    }
}
