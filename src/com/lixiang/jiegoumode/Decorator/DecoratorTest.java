package com.lixiang.jiegoumode.Decorator;

/**
 * Created by Administrator on 2017/8/11 0011.
 * 变形金刚
 * 装饰（Decorator）模式：动态的给对象增加一些职责，即增加其额外的功能
 */
public class DecoratorTest {
    /*
    * 装饰器模式的应用场景：

    1、需要扩展一个类的功能。

    2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）

   缺点：产生过多相似的对象，不易排错！*/
    public static void main(String[] args) {
        Transform car = new Car();
        car.move();
        Robot   robot = new Robot(car);
        robot.move();
        robot.say();
    }
}

