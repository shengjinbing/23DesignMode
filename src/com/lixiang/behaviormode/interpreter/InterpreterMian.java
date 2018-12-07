package com.lixiang.behaviormode.interpreter;

/**
 * 解释器模式
 */
public class InterpreterMian {
    public static void main(String[] args) {
        String     statement  =  "3 * 4 / 2 % 4";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        System.out.println(calculator.compute());
    }
}
