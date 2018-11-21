package com.lixiang.jiegoumode.Composite;

/**
 * Created by Administrator on 2017/8/11 0011.
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
