package com.lixiang.jiegoumode.Proxy.staticproxy;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public interface AbstractPermission {
     void modifyUserInfo();
     void viewNote();
     void publishNote();
     void modifyNote();
     void setLevel(int level);
}
