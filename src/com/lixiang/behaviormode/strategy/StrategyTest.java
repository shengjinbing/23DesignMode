package com.lixiang.behaviormode.strategy;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class StrategyTest {
    /**
     * 策略模式
     * @param args
     */
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
