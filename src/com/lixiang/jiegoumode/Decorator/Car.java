package com.lixiang.jiegoumode.Decorator;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Car implements Transform {
    public Car() {
        System.out.println("变形金刚是一辆车！");
    }

    @Override
    public void move() {
        System.out.println("在陆地上移动");
    }
}
