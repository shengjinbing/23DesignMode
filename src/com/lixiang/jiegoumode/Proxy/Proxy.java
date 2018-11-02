package com.lixiang.jiegoumode.Proxy;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Proxy implements Sourceable {
    private Sourceable source;

    public Proxy() {
        source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        before();
    }

    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}
