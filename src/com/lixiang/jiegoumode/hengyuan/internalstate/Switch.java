package com.lixiang.jiegoumode.hengyuan.internalstate;

/**
 * 交换机类
 */
public class Switch implements NetworkDevice {
    private String type;

    public Switch(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void use() {
        System.out.println(type+","+"Switch");
    }
}
