package com.lixiang.chuangjianzhemode.abstractfactory;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class TCLFactory implements EFactory {


    @Override
    public ITelevision produceTV() {
        return new TCLTelevision();
    }

    @Override
    public IAirConditioner productAirConditioner() {
        return new TCLAirConditioner();
    }
}
