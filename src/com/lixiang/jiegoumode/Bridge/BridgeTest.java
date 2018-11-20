package com.lixiang.jiegoumode.Bridge;

/**
 * Created by Administrator on 2017/8/11 0011.
 * 桥接模式，模拟毛笔
 */
public class BridgeTest {
    public static void main(String[] args) {
        Pen pen = new SmallPen();
        pen.setColor(new Green());
        pen.draw("鲜花");
    }
}
