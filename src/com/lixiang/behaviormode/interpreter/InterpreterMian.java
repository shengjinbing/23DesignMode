package com.lixiang.behaviormode.interpreter;

/**
 * 解释器模式：提供如何定义语言的文法，以及对语言句子的解释方法，即解释器
 */
public class InterpreterMian {
    public static void main(String[] args) {
        String     statement  =  "3 * 4 / 2 % 4";
        Calculator calculator = new Calculator();
        calculator.build(statement);
        System.out.println(calculator.compute());
    }
}
