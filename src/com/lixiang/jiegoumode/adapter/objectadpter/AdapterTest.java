package com.lixiang.jiegoumode.adapter.objectadpter;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class AdapterTest {
        public static void main(String[] args) {
            DogAdapter adapter = new DogAdapter(new Dog());
            adapter.cry();
            adapter.move();
        }
}
