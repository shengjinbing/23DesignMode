package com.lixiang.behaviormode.template;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Plus extends AbstractCalculator{
    @Override
    public int calculate(int num1,int num2) {
        return num1 + num2;
    }
}