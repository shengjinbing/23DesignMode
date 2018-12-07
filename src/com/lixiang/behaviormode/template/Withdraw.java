package com.lixiang.behaviormode.template;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Withdraw extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("取钱");
    }
}