package com.lixiang.behaviormode.mediator;

/**
 * 中介者（Mediator）模式：定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象之间不必相互了解
 */
public class ChatRoomMain {
    public static void main(String[] args) {
        AbstractChatRoom chatRoom = new ChatGroup();

        Member commonMember = new CommonMember("张三");
        Member DiamondMember = new CommonMember("李四");
        chatRoom.register(commonMember);
        chatRoom.register(DiamondMember);

        commonMember.sendText("李四","李四你好！");
        commonMember.sendImage("李四","李四图片你好！");
        DiamondMember.sendText("张三","张三你好！");
        DiamondMember.sendImage("张三","张三图片你好！");

    }
}
