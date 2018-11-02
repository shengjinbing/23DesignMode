package com.lixiang.behaviormode.Command;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
