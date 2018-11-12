package com.lixiang.chuangjianzhemode.mulfactory;

public class SmsFactory implements SendFactory {
    @Override
    public Sender CreateSend() {
        return new SmsSender();
    }
}
