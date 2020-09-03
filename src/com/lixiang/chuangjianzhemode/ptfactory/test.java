package com.lixiang.chuangjianzhemode.ptfactory;

/**
 * Created by Administrator on 2017/8/10 0010.
 *
 * 创建型：5   行为型：11  结构性：7
 */
public class test {

    /**
     * 简单工厂模式(也称为静态工厂)
     *
     * 1 扩展性差（我想增加一种面条，除了新增一个面条产品类，还需要修改工厂类方法）
     *
     * 2 不同的产品需要不同额外参数的时候 不支持。
     *
     * @param args
     */
    public static void main(String[] args) {
        Sender mail = SendFactory.produce("mail");
        mail.sender();

    }
}
