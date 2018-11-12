package com.lixiang.chuangjianzhemode.ptfactory;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class test {

    /**
     * 简单工厂模式
     *
     * @param args
     */
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender mail = sendFactory.produce("mail");
        mail.sender();

    }
}
