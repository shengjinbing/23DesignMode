package com.lixiang.behaviormode.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public abstract class AbstractSubject implements Subject{
    Vector<Observer> vectors = new Vector<>();
       @Override
    public void add(Observer observer) {
        vectors.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vectors.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> elements = vectors.elements();
        while (elements.hasMoreElements()){
            elements.nextElement().updata();
        }
    }
}
