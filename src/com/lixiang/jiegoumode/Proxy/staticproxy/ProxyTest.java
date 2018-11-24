package com.lixiang.jiegoumode.Proxy.staticproxy;

import com.lixiang.jiegoumode.Proxy.staticproxy.AbstractPermission;
import com.lixiang.jiegoumode.Proxy.staticproxy.PermissionProxy;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class ProxyTest {
    /*
    * 装饰器模式的应用场景：

    1、需要扩展一个类的功能。

    2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）

   缺点：产生过多相似的对象，不易排错！*/
    public static void main(String[] args) {
        AbstractPermission permissionProxy = new PermissionProxy();
        permissionProxy.setLevel(1);
        permissionProxy.modifyUserInfo();
    }
}

