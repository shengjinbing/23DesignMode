package com.lixiang.chuangjianzhemode.mulfactory;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class SmsSender implements Sender {
    @Override
    public void sender() {
        System.out.println("this is sms sender!");
    }
}
