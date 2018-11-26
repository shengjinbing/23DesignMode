package com.lixiang.behaviormode.Command.standard;

/**
 * Created by Administrator on 2017/8/11 0011.
 * 调用者
 */
public class Controller {
    private AbstractCommand openCommand;
    private AbstractCommand closeCommand;
    private AbstractCommand changeCommand;

    public Controller(AbstractCommand openCommand, AbstractCommand closeCommand, AbstractCommand changeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeCommand = changeCommand;
    }

    public void open() {
        openCommand.execute();
    }

    public void close() {
        closeCommand.execute();
    }

    public void change() {
        changeCommand.execute();
    }
}
