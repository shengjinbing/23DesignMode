package com.lixiang.behaviormode.mediator;

/**
 * 普通会员类
 */
public class CommonMember extends Member {
    public CommonMember(String name) {
        super(name);
    }

     @Override
    public void sendText(String to, String message) {
        System.out.println("普通会员发送消息");
        chatRoom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通会员发送图片");
        chatRoom.sendImage(name,to,image);
    }
}
