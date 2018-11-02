package com.lixiang.chuangjianzhemode.SingletonOne;

public class Singleton3 {
    //饿汉，变种
    private static Singleton3 instance = null;

    static {
        instance = new Singleton3();
    }
    private Singleton3 (){}
    public static Singleton3 getInstance() {
        return instance;
    }
}
