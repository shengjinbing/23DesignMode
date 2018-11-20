package com.lixiang.jiegoumode.Bridge;

public class White implements Color {
    @Override
    public void bePaint(String penType, String name) {
        System.out.println(penType+"白色的"+name+".");
    }
}
