package com.lixiang.jiegoumode.Bridge;

public class MiddlePen extends Pen{

    @Override
    public void draw(String name) {
        String penType = "中毛笔写字";
        color.bePaint(penType,name);
    }
}
