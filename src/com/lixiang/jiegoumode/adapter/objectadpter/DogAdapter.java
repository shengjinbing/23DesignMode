package com.lixiang.jiegoumode.adapter.objectadpter;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class DogAdapter implements Robot {
    private Dog dog;
    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void cry() {
        dog.wang();
    }

    @Override
    public void move() {
       dog.run();
    }
}
