package com.lixiang.behaviormode.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BuyBasket {
    private List list  = new ArrayList();
    public void  accept(Visitor visitor){
            Iterator i = list.iterator();
            while (i.hasNext()){
                Product product = (Product) i.next();
                product.accept(visitor);
            }
    }

    public void addProduct(Product product){
        list.add(product);
    }

    public void removeProduct(Product product){
        list.remove(product);
    }

}
