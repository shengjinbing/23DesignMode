package com.lixiang.jiegoumode.adapter.bothwayadapter;

public class ConcreteAdaptee implements Adaptee{
    @Override
    public void specificRequest() {
        System.out.println("ConcreteAdaptee特殊的请求A");
    }
}
