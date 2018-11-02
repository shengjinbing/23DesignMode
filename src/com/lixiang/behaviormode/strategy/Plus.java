package com.lixiang.behaviormode.strategy;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}