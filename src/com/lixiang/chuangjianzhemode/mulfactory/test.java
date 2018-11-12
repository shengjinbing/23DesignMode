package com.lixiang.chuangjianzhemode.mulfactory;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class test {

    /**
     *方法工厂模式
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
