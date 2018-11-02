package com.lixiang.chuangjianzhemode.SingletonOne;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class Singleton7 {
    /* 私有构造方法，防止被实例化 */
    private Singleton7() {
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static Singleton7 instance = new Singleton7();
    }

    /* 获取实例 */
    public static Singleton7 getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}
