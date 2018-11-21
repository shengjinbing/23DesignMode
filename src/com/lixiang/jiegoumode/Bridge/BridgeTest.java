package com.lixiang.jiegoumode.Bridge;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/11 0011.
 * 桥接模式，模拟毛笔
 */
public class BridgeTest {
    public static void main(String[] args) {
        Pen pen = new SmallPen();
        pen.setColor(new Green());
        pen.draw("鲜花");
        String s = "dasdas";
        char[] chars = s.toCharArray();
        Map<Integer,Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int max = 0;
        for (int i = 0; i <chars.length ; i++) {
            sb.append(chars[i]);
            int length = sb.length();
            if (map.containsValue(chars[i])) {
                  if (length > max){
                      max = length;
                  }
                  map.clear();
            }else {
               map.put(i,chars[i]);
            }

        }
    }
}
