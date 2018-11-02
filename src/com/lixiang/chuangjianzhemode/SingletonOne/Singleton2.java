package com.lixiang.chuangjianzhemode.SingletonOne;

public class Singleton2 {
    //饿汗
    private Singleton2() {
    }

    private static Singleton2 instance = new Singleton2();

    public static Singleton2 getInstance(){
        return instance;
    }
}
