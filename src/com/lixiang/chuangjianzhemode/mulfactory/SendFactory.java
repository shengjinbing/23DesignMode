package com.lixiang.chuangjianzhemode.mulfactory;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class SendFactory {
    //多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，
    // 如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，
    // 分别创建对象,静态工程模式只需要将方法改为静态的就行
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
