package com.lixiang.behaviormode.template;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public abstract class BankTemplateMethod {
    public void takeNumber(){
        System.out.println("取号排队");
    }

    public abstract void transact();

    public void evaluate(){
        System.out.println("服务评分");
    }

    public void process(){
        takeNumber();
        transact();
        evaluate();
    }

}
