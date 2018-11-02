package com.lixiang.jiegoumode.objectadpter;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Adapter  implements Targetable {
    private Source source;
    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
