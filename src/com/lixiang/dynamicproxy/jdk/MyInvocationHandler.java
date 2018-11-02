package com.lixiang.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/24 0024.
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;
    public MyInvocationHandler(Object object) {
        this.target = object;
    }

    /*
     * @param proxy指代我们所代理的那个真实对象
     * @param method指代的是我们所要调用真实对象的某个方法的Method对象
     * @param args指代的是调用真实对象某个方法时接受的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("getName")) {
            System.out.println("++++++before " + method.getName() + "++++++");
            Object result = method.invoke(target, args);
            System.out.println("++++++after " + method.getName() + "++++++");
            return result;
        }else {
            Object result = method.invoke(target, args);
            return result;
        }
    }
}
