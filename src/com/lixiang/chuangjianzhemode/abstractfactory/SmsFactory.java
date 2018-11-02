package com.lixiang.chuangjianzhemode.abstractfactory;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class SmsFactory implements Provider{

    @Override
    public Sender product() {
        return new SmsSender();
    }
}
