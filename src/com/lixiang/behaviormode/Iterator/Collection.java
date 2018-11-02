package com.lixiang.behaviormode.Iterator;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public interface  Collection {
    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
