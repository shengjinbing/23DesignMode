package com.lixiang.jiegoumode.Decorator;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
