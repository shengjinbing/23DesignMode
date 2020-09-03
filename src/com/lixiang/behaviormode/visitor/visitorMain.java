package com.lixiang.behaviormode.visitor;


/**
 * 访问者（Visitor）模式：在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，
 * 即每个元素有多个访问者对象访问。
 */
public class visitorMain {
    public static void main(String[] args) {
        Product book  = new Book();
        Product book1 = new Book();
        Product apple = new Apple();
        Visitor visitor;

        BuyBasket buyBasket = new BuyBasket();
        buyBasket.addProduct(book);
        buyBasket.addProduct(book1);
        buyBasket.addProduct(apple);

        visitor = new Customer();
        visitor.setName("张三");
        buyBasket.accept(visitor);
    }
    }
