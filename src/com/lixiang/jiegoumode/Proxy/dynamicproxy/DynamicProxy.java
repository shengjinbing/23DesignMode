package com.lixiang.jiegoumode.Proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object obj;
    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest();
        Object invoke = method.invoke(obj, args);
        postRequest();
        return invoke;
    }

    private void preRequest() {
        System.out.println("调用之前");
    }

    private void postRequest() {
        System.out.println("调用之后");
    }
}
