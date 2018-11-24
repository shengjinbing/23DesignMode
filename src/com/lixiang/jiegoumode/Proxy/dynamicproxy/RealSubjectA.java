package com.lixiang.jiegoumode.Proxy.dynamicproxy;

public class RealSubjectA implements AbstractSubject {
    @Override
    public String requset(int type) {
        System.out.println(type+"这个事真实的类A！");
        return "AAAA";
    }
}
