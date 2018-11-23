package com.lixiang.jiegoumode.hengyuan.internalstate;

public class Client {
    public static void main(String[] args) {
        DeviceFactory df = new DeviceFactory();
        NetworkDevice cisco = df.getNetworkDevices("cisco");
        cisco.use();

        NetworkDevice tp = df.getNetworkDevices("tp");
        tp.use();
    }
}
