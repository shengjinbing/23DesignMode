package com.lixiang.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/8/24 0024.
 */
public class jdkmain {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);
        /**
         * loader:　　一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载

         interfaces:　　一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了

         InvocationHandler:　　一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
         */
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                myInvocationHandler);
        System.out.println(userServiceProxy.getName(1));
        //System.out.println(userServiceProxy.getAge(1));
    }
}
