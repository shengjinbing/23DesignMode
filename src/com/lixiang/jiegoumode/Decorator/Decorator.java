package com.lixiang.jiegoumode.Decorator;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
