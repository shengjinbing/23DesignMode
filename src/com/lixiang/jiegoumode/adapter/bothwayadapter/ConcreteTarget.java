package com.lixiang.jiegoumode.adapter.bothwayadapter;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget的方法");
    }
}
