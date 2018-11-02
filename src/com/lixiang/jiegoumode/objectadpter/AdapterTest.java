package com.lixiang.jiegoumode.objectadpter;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class AdapterTest {
   // 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，
   // 目的是消除由于接口不匹配所造成的类的兼容性问题。主要分为三类：
   // 类的适配器模式、对象的适配器模式、接口的适配器模式。首先，我们来看看类的适配器模式

    /*基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，
    而是持有Source类的实例，以达到解决兼容性的问题*/

        public static void main(String[] args) {
            Targetable target = new Adapter(new Source());
            target.method1();
            target.method2();
    }
}
