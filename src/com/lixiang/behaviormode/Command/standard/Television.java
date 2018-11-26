package com.lixiang.behaviormode.Command.standard;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Television {
    public void open() {
        System.out.println("open command received!");
    }

    public void close() {
        System.out.println("close command received!");
    }

    public void change() {
        System.out.println("change command received!");
    }
}
