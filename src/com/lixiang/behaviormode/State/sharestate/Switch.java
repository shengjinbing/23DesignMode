package com.lixiang.behaviormode.State.sharestate;

/**
 * 环境类
 */
public class Switch {
    private static State state,onState,offState;
    private String name;

    public Switch(String name) {
        onState = new OnState();
        offState = new OffState();
        state = onState;
        this.name = name;
    }

    public void setState(State state) {
        Switch.state = state;
    }

    public void on() {
        System.out.println(name);
        state.on(this);

    }


    public void off() {
        System.out.println(name);
        state.off(this);
    }

    public static State getState(String type){
        if (type.equalsIgnoreCase("on")){
            return onState;
        }else {
            return offState;
        }
    }
}
