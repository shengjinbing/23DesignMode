package com.lixiang.behaviormode.Command;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class MyCommand implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
