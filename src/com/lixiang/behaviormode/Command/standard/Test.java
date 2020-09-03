package com.lixiang.behaviormode.Command.standard;

/**
 * 命令模式：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开
 *
 * Created by Administrator on 2017/8/11 0011.
 * 电视遥控器
 */
public class Test {
    /**
     * 将发送命令的责任和执行命令的责任分开
     */
    public static void main(String[] args) {
        AbstractCommand tvOpenCommand, tvCloseCommand, tvChangeCommand;
        tvOpenCommand = new TVOpenCommand();
        tvCloseCommand = new TVCloseCommand();
        tvChangeCommand = new TVChangeCommand();
        Controller invoker = new Controller(tvOpenCommand, tvCloseCommand, tvChangeCommand);
        invoker.open();
        invoker.close();
        invoker.change();
    }
}
