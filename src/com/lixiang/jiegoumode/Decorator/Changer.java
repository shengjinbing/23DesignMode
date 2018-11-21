package com.lixiang.jiegoumode.Decorator;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Changer implements Transform {
    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }
}
