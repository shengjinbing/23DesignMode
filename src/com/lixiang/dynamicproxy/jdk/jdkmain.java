package com.lixiang.dynamicproxy.jdk;

import net.sf.cglib.proxy.Enhancer;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/8/24 0024.
 */
public class jdkmain {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);
        /**
         * loader:　　一个Cla¬ssLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载

         interfaces:　　一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，
         如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了

         InvocationHandler:　　一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，
         会关联到哪一个InvocationHandler对象上
         */
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                myInvocationHandler);

        System.out.println(userServiceProxy.getName(1));
        //System.out.println(userServiceProxy.getAge(1));

        UserService userServiceProxy1 = create(UserService.class);
        System.out.println(userServiceProxy1.getName(1));


       /* //基于cglib的动态代理，不需要让类实现
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(UserServiceCglib.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new MyMethodInterceptor());
        // 创建代理对象
        UserServiceCglib proxy= (UserServiceCglib)enhancer.create();
        // 通过代理对象调用目标方法
        System.out.println(proxy.getAge(30));*/
    }

    public static <T> T create(final Class<T> service) {
        return (T) Proxy.newProxyInstance(
                service.getClassLoader(),
                new Class<?>[]{service},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, @Nullable Object[] args)
                            throws Throwable {
                        // If the method is a method from Object then defer to normal invocation.
                        if (method.getDeclaringClass() == Object.class) {
                            return method.invoke(this, args);
                        }
                        System.out.println("asdasdsa");
                        return "200";
                    }
                });
    }

}
