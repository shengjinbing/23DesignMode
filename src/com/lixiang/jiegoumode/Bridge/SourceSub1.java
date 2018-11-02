package com.lixiang.jiegoumode.Bridge;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class SourceSub1 implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
