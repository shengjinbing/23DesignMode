package com.lixiang.jiegoumode.Bridge;

public class Blue implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+"蓝色的"+name+".");
    }
}
