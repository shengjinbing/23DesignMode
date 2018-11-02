package com.lixiang.behaviormode.chain;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
