package com.lixiang.behaviormode.template;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class TemplateTest {
    //解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，
    // 可以是抽象的，也可以是实际的方法，
    // 定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
    public static void main(String[] args) {
        BankTemplateMethod deposit = new Deposit();
        deposit.process();
    }

}