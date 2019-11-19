package com.lixiang.chuangjianzhemode.SingletonOne;

public class Singleton5 {
    //双重校验证
    /*主要是禁止重排序，初始化一个实例（SomeType st = new SomeType()）在java字节码中会有4个步骤：

            1、申请内存空间
            2、初始化默认值（区别于构造器方法的初始化）
            3、执行构造器方法
            4、连接引用和实例

    这4个步骤后两个有可能会重排序，1234或1243都有可能，造成未初始化完全的对象发布。volatile可以禁止指令重排序，
    从而避免这个问题。

    synchronized 禁止重排序是通过内存屏障实现的, 简单来说, 内存屏障只保证指令不会越过该屏障,
    而synchronized块内部的指令仍然有可能发生重排序？？？如何理解？



    A线程获取锁，接着执行对UniqueInstance对象的一系列实例化操作，然而在执行构造器方法之前，先一步连接引用和实例，
    然后释放锁（really???）；随后B线程获取锁，发现null == instance为false，于是满足地离开，并试图访问instance
    实例内部的变量，却发现根本没有理想的值（这些值原本在构造器内定义）然后抛错，因为此时instance实例的构造器方法尚未
    执行完成。

    */
    private Singleton5(){

    }

    private volatile static Singleton5 instance;

    private static Singleton5 getInstance(){
        if (instance == null){
            synchronized (Singleton5.class){
                if (instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
