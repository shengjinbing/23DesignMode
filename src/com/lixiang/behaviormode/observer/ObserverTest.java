package com.lixiang.behaviormode.observer;

import javax.swing.*;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class ObserverTest{
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
