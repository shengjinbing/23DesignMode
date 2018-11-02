package com.lixiang.chuangjianzhemode.ptfactory;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class MailSender implements Sender {
    @Override
    public void sender() {
        System.out.println("this is mailsender!");
    }
}
