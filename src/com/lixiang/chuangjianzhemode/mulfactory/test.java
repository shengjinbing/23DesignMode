package com.lixiang.chuangjianzhemode.mulfactory;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class test {

    /**
     *工厂方法模式
     *
     * 解决简单工厂不符合开闭原则的问题
     *
     * @param args
     */
    public static void main(String[] args) {
        SendFactory sendFactory = new SmsFactory();
        Sender sms = sendFactory.CreateSend();
        sms.sender();

        MailFactory mailFactory = new MailFactory();
        Sender      mail      = mailFactory.CreateSend();
        mail.sender();
    }
}
