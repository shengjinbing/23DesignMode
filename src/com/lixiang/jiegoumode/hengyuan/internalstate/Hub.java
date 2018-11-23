package com.lixiang.jiegoumode.hengyuan.internalstate;

/**
 * 集线器类
 */
public class Hub implements NetworkDevice {
    private String type;

    public Hub(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void use() {
        System.out.println(type+","+"HUb");
    }
}
