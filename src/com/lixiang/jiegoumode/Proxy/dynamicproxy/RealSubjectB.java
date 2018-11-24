package com.lixiang.jiegoumode.Proxy.dynamicproxy;

public class RealSubjectB implements AbstractSubject {
    @Override
    public String requset(int type) {
        System.out.println(type+"这个事真实的类B！");
        return "BBBBB";
    }
}
