package com.lixiang.chuangjianzhemode.abstractfactory;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class SmsSender implements Sender {
    @Override
    public void sender() {
        System.out.println("this is sms sender!");
    }
}
