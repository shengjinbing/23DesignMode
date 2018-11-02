package com.lixiang.chuangjianzhemode.SingletonOne;

import jdk.nashorn.internal.ir.IfNode;

public class Singleton5 {
    //双重校验证
    private Singleton5(){

    }

    private static Singleton5 instance;

    private static Singleton5 getInstance(){
        if (instance == null){
            synchronized (Singleton5.class){
                if (instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
