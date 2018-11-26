package com.lixiang.behaviormode.Iterator;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public interface  Iterator {
    //前移
     Object previous();

    //后移
     Object next();
     boolean hasNext();

    //取得第一个元素
     Object first();
}
