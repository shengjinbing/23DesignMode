package com.lixiang.behaviormode.visitor;

public class Book implements Product {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
