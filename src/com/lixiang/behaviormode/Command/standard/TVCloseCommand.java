package com.lixiang.behaviormode.Command.standard;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class TVCloseCommand implements AbstractCommand {
    private Television television;

    public TVCloseCommand() {
        this.television = new Television();
    }

    @Override
    public void execute() {
        television.close();
    }
}
