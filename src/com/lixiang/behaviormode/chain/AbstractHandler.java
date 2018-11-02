package com.lixiang.behaviormode.chain;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public abstract class AbstractHandler implements  Handler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
