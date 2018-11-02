package com.lixiang.behaviormode.Iterator;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class Test {
    public static void main(String[] args) {
        //此处我们貌似模拟了一个集合类的过程，感觉是不是很爽？其实JDK中各个类也都是这些基本的东西，
        // 加一些设计模式，再加一些优化放到一起的，只要我们把这些东西学会了，
        // 掌握好了，我们也可以写出自己的集合类，甚至框架！
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
