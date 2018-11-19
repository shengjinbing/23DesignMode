package com.lixiang.jiegoumode.adapter.bothwayadapter;

public class Adapter implements Target,Adaptee {
    private Target target;
    private Adaptee adaptee;

    public Adapter(Target target, Adaptee adaptee) {
        this.target = target;
        this.adaptee = adaptee;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void specificRequest() {
        adaptee.specificRequest();
    }

    @Override
    public void request() {
        target.request();
    }
}
