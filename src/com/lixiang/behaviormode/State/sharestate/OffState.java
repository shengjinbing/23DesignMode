package com.lixiang.behaviormode.State.sharestate;

public class OffState extends State {
    @Override
    public void on(Switch c) {
        System.out.println("打开");
    }

    @Override
    public void off(Switch c) {
        System.out.println("已经关闭");
        c.setState(Switch.getState("on"));
    }
}
