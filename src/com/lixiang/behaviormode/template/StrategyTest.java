package com.lixiang.behaviormode.template;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class StrategyTest {
    //解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，
    // 可以是抽象的，也可以是实际的方法，
    // 定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);

        System.out.println(formatDecimalDigits("0", 2));
        System.out.println(formatDecimal(null, 2));
    }

    public static String formatDecimal (String value,int num){
        final DecimalFormat formater = new DecimalFormat();
        formater.setMaximumFractionDigits(num);
        formater.setGroupingSize(0);
        formater.setRoundingMode(RoundingMode.FLOOR);
        String result = formater.format(Double.parseDouble(value));
        String format = String.format("%.2f",  Double.valueOf(result));
        return format;
    }
    public static String formatDecimalDigits(String value, int num) {
        Double aDouble = 0.0;
        try {
            aDouble = Double.parseDouble(value);
            if (aDouble == 0) {
                return "0.00";
            }
        } catch (Exception e) {
            return value;
        }

        if (num == 8) {
            int i = value.indexOf(".");
            if (i == -1) {
                return value;
            }
            if (i > 0 && i < value.length() && value.substring(i).length() > 9) {
                return String.format("%." + num + "f", aDouble);
            } else {
                return value;
            }
        } else {
            return String.format("%." + num + "f", aDouble);
        }
    }
}
