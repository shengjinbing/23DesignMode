package com.lixiang.behaviormode.Command.standard;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class TVChangeCommand implements AbstractCommand {
    private Television television;

    public TVChangeCommand() {
        this.television = new Television();
    }

    @Override
    public void execute() {
        television.change();
    }
}
