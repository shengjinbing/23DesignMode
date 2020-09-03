package com.lixiang.jiegoumode.Composite;

/**
 * Created by Administrator on 2017/8/11 0011.
 * 组合（Composite）模式：将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性。
 */
public class CompositeMain {
    public static void main(String[] args) {
        MyElement plate = new Plate();
        plate.add(new Apple());
        plate.add(new Banana());

        MyElement plate1 = new Plate();
        plate1.add(new Banana());
        plate1.add(new Pear());

        MyElement plate2 = new Plate();
        plate2.add(new Apple());
        plate2.add(plate);
        plate2.add(plate1);

        plate2.eat();
    }
}
