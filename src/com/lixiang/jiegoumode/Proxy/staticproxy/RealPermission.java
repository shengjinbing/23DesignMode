package com.lixiang.jiegoumode.Proxy.staticproxy;

import com.lixiang.jiegoumode.Proxy.staticproxy.AbstractPermission;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class RealPermission implements AbstractPermission {

    @Override
    public void modifyUserInfo() {
        System.out.println("修改用户信息");
    }

    @Override
    public void viewNote() {
        System.out.println("查看帖子");
    }

    @Override
    public void publishNote() {
        System.out.println("发布新帖");
    }

    @Override
    public void modifyNote() {
        System.out.println("修改帖的内容");
    }

    @Override
    public void setLevel(int level) {

    }
}
