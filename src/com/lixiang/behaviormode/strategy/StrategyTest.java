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
        System.out.println(JumpFloorII(5));

    }

    public static int JumpFloorII(int target) {
        if(target == 0)return 0;
        if(target == 1)return 1;
        if(target == 2)return 2;
        int sum = JumpFloorII(target-1)+JumpFloorII(target-2);
        return sum + target -2;
    }
}
