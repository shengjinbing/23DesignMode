package com.lixiang.behaviormode.Iterator;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class MyCollection implements Collection {
    public String string[] = {"A","B","C","D","E"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
