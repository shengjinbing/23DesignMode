package com.lixiang.jiegoumode.Bridge;

/**
 * Created by Administrator on 2017/8/11 0011.
 * 抽象类防止实例化
 */
public abstract class Bridge {
    private Sourceable source;
    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
