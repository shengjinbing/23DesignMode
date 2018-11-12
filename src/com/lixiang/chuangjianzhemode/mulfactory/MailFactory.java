package com.lixiang.chuangjianzhemode.mulfactory;

public class MailFactory implements SendFactory {

    @Override
    public Sender CreateSend() {
        return new MailSender();
    }
}
