package com.lixiang.behaviormode.visitor;



public class Customer extends Visitor {
    @Override
    public void visit(Apple apple) {
        System.out.println(name+"查看了苹果");
    }

    @Override
    public void visit(Book book) {
        System.out.println(name+"查看了图书");
    }
}
