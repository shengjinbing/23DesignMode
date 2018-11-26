package com.lixiang.behaviormode.Command.standard;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class TVOpenCommand implements AbstractCommand {
    private Television television;

    public TVOpenCommand() {
        this.television = new Television();
    }

    @Override
    public void execute() {
        television.open();
    }
}
