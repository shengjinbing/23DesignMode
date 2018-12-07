package com.lixiang.behaviormode.interpreter;

/**
 * 终结符表达式类
 */
public class ValueNode implements Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
