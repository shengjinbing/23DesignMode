package com.lixiang.chuangjianzhemode.abstractfactory;

public class TCLAirConditioner implements IAirConditioner{
    @Override
    public void changeTemperature() {
        System.out.println("TCL空调温度调节中。。。");
    }
}
