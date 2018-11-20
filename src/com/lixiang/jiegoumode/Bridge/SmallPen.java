package com.lixiang.jiegoumode.Bridge;

public class SmallPen extends Pen {
    @Override
    public void draw(String name) {
        String penType = "小毛笔写字";
        color.bePaint(penType,name);
    }
}
