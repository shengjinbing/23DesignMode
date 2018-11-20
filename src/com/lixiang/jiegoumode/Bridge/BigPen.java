package com.lixiang.jiegoumode.Bridge;

public class BigPen extends Pen {
    @Override
    public void draw(String name) {
        String penType = "大毛笔写字";
        color.bePaint(penType,name);
    }
}
