package com.lixiang.jiegoumode.Composite;

import java.util.ArrayList;
import java.util.List;

public class Plate extends MyElement {

    List<MyElement> list = new ArrayList<>();

    @Override
    public void add(MyElement element) {
        list.add(element);
    }

    public void remove(MyElement element) {
        list.remove(element);
    }

    @Override
    public void eat() {
        for (MyElement element : list) {
            element.eat();
        }
    }
}
