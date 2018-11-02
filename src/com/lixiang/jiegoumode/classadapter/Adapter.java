package com.lixiang.jiegoumode.classadapter;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
