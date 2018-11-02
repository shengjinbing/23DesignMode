package com.lixiang.behaviormode.Command;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
