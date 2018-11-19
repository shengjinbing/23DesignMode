package com.lixiang.jiegoumode.adapter.classadapter;

import com.lixiang.jiegoumode.adapter.objectadpter.Dog;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class DogAdapter extends Dog implements Robot {
    @Override
    public void cry() {
        wang();
    }

    @Override
    public void move() {
        run();
    }
}
