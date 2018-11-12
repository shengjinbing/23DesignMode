package com.lixiang.chuangjianzhemode.abstractfactory;

public class HaierAirConditioner implements IAirConditioner{

    @Override
    public void changeTemperature() {
        System.out.println("海尔空调温度调节中。。。");
    }
}
