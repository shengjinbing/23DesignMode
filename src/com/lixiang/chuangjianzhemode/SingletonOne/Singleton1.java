package com.lixiang.chuangjianzhemode.SingletonOne;

public class Singleton1 {
    //懒汉安全

    //1.私有构造方法
    private Singleton1(){
    }

    private static Singleton1 instance;

    public static synchronized Singleton1 getInstance(){
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
