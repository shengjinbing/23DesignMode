package com.lixiang.jiegoumode.hengyuan.internalstate;

import java.util.ArrayList;
import java.util.List;

public class DeviceFactory {
    List<NetworkDevice>devices = new ArrayList<>();
    private int totalTerminal = 0;

    public DeviceFactory() {
        NetworkDevice cisco = new Switch("Cisco");
        devices.add(cisco);
        NetworkDevice tp = new Hub("TP");
        devices.add(tp);
    }

    public NetworkDevice getNetworkDevices(String type) {
        if (type.equalsIgnoreCase("cisco")){
            totalTerminal++;
            return devices.get(0);
        }else if (type.equalsIgnoreCase("tp")){
            totalTerminal++;
            return devices.get(1);
        }else {
            return null;
        }
    }

    public int getTotalTerminal() {
        return totalTerminal;
    }

    public int getTotalDevice(){
        return devices.size();
    }
}
