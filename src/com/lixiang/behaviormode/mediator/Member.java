package com.lixiang.behaviormode.mediator;

/**
 * 抽象会员类
 */
public abstract class Member {
  protected AbstractChatRoom chatRoom;
  protected String name;

    public AbstractChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(AbstractChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member(String name) {
        this.name = name;
    }
    public abstract void sendText(String to,String message);
    public abstract void sendImage(String to,String message);
    public void receiveText(String from,String message){
        System.out.println(from+"发送文本给"+this.name+",内容为："+message);
    }
    public void receiveImage(String from,String message){
        System.out.println(from+"发送图片给"+this.name+",内容为："+message);
    }
}
