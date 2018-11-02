package com.lixiang.behaviormode.observer;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
