package com.lixiang.behaviormode.visitor;

public class Apple implements Product {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
