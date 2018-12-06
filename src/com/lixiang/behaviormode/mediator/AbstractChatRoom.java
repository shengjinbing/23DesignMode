package com.lixiang.behaviormode.mediator;

/**
 * 抽象中介者
 */
public abstract class AbstractChatRoom {
    public abstract void register(Member member);
    public abstract void sendText(String from,String to,String message);
    public abstract void sendImage(String from,String to,String image);
}
