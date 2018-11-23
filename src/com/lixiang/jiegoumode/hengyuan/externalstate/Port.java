package com.lixiang.jiegoumode.hengyuan.externalstate;

/**
 * 端口号，调用亨元对象的use方法的时候将传入一个Port类型对象，在Port
 * 中封装端口号，作为共享网络中的外部状态，同一个网络设备具有多个不同的
 * 端口号
 */
public class Port {
    String port;

    public Port(String port) {
        this.port = port;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
