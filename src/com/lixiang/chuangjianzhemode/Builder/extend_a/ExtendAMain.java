package com.lixiang.chuangjianzhemode.Builder.extend_a;

import java.util.concurrent.TimeUnit;

public class ExtendAMain {
    /**
     * 属于扩展的建造者模式
     * （1）省略抽象建造者角色
     * （2）省略指挥者角色
     * 让Builder角色扮演指挥者和建造者双重角色
     * @param args
     */
    public static void main(String[] args) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor()
                .connectTimeout(1, TimeUnit.SECONDS)
                .readTimeout(1, TimeUnit.SECONDS)
                .writeTimeout(1, TimeUnit.SECONDS)
                .build();
    }
}
