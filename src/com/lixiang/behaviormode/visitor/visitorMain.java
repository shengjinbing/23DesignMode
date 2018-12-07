package com.lixiang.behaviormode.visitor;


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
