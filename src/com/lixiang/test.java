package com.lixiang;

import com.lixiang.behaviormode.Iterator.Collection;
import com.lixiang.jiegoumode.classadapter.Source;

import java.util.*;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class test {
    public static void main(String[] args) {
        int i = 6 % 8;
        System.out.println(i);
       /* String ip = "192.168.0.1";
        String[] s = ip.split("\\.");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
        }
        System.out.println(Integer.parseInt(String.valueOf(sb)));*/

      /*  LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
        hashMap.put(1, "a");
        hashMap.put(1, "5");
        hashMap.put(1, "6");
        hashMap.put(1, "7");
        hashMap.put(1, "8");

        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            // System.out.println(key);
            System.out.println(value);
        }*/
    /*    Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator1 = hashMap.keySet().iterator();
        if (iterator1.hasNext()) {
            Integer next = iterator1.next();
            String s = hashMap.get(next);
            System.out.println(s);
        }
        */
/*
                SimpleCache<Integer, Integer> cache = new SimpleCache<>(3);

                for (int i = 0; i < 10; i++) {
                    cache.save(i, i * i);
                }

                System.out.println("插入10个键值对后，缓存内容：");
                System.out.println(cache + "\n");

                System.out.println("访问键值为7的节点后，缓存内容：");
                cache.getOne(7);
                System.out.println(cache + "\n");

                System.out.println("插入键值为1的键值对后，缓存内容：");
                cache.save(1, 1);
                System.out.println(cache);
            }*/

    }
}
