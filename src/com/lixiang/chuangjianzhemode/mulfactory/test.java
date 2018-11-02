package com.lixiang.chuangjianzhemode.mulfactory;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class test {

    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender mail = sendFactory.produceMail();
        mail.sender();

    }
}
