package com.lixiang.jiegoumode.Proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyMain {
    public static void main(String[] args) {
        DynamicProxy h = new DynamicProxy(new RealSubjectA());
        AbstractSubject abstractSubject = (AbstractSubject) Proxy.newProxyInstance(
                AbstractSubject.class.getClassLoader(),
                new Class[]{AbstractSubject.class},
                h);
        String requset = abstractSubject.requset(1);
        System.out.println(requset);
    }
}
