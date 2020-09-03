package com.lixiang.jiegoumode.hengyuan.internalstate;

/**
 * 享元（Flyweight）模式：运用共享技术来有效地支持大量细粒度对象的复用。
 */
public class ClientMain {
    public static void main(String[] args) {
        DeviceFactory df = new DeviceFactory();
        NetworkDevice cisco = df.getNetworkDevices("cisco");
        cisco.use();

        NetworkDevice tp = df.getNetworkDevices("tp");
        tp.use();
    }
}
