package com.lixiang.jiegoumode.adapter.bothwayadapter;

public class BothwayAdapterMain {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new ConcreteTarget(), new ConcreteAdaptee());
        adapter.specificRequest();
        adapter.request();
    }
}
