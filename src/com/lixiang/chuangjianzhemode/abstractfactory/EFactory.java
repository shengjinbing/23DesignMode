package com.lixiang.chuangjianzhemode.abstractfactory;

/**
 * 电器工厂类
 * Created by Administrator on 2017/8/10 0010.
 */
public interface EFactory {
     ITelevision produceTV();//生产电视
     IAirConditioner productAirConditioner();//生产冰箱
}
