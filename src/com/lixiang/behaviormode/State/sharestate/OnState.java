package com.lixiang.behaviormode.State.sharestate;

public class OnState extends State {
    @Override
    public void on(Switch c) {
        System.out.println("已经打开");
    }

    @Override
    public void off(Switch c) {
        System.out.println("关闭");
        c.setState(Switch.getState("off"));
    }
}
