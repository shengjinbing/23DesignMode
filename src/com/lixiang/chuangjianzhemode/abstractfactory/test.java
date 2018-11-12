package com.lixiang.chuangjianzhemode.abstractfactory;

/**
 * 抽象工厂方法
 *
 * Created by Administrator on 2017/8/10 0010.
 */
public class test {
    public static void main(String[] args) {
        EFactory tclFactory = new TCLFactory();
        tclFactory.produceTV().play();
        tclFactory.productAirConditioner().changeTemperature();

        HaierFactory haierFactory = new HaierFactory();
        haierFactory.produceTV().play();
        haierFactory.productAirConditioner().changeTemperature();

    }
}
