package com.lixiang.behaviormode.observer.awt;

import java.util.EventObject;

/**
 * 事件类，不是观察者模式的一部分，但可以在目标对象和观察者直接传递数据
 */
public class LoginEvent extends EventObject {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String userName;
    private String password;

    public LoginEvent(Object source, String userName, String password) {
        super(source);
        this.userName = userName;
        this.password = password;
    }
}
