package com.lixiang.behaviormode.observer;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class ObserverTest{
    public static void main(String[] args) {
        Subject sub = new MySubject();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        //订阅
        sub.add(observer1);
        sub.add(observer2);
        //发送通知
        sub.operation();

        //取消订阅
        sub.del(observer1);
        sub.del(observer2);
        sub.operation();


    }
}
