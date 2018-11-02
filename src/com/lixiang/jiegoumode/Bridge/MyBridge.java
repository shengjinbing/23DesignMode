package com.lixiang.jiegoumode.Bridge;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public  class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
