package com.lixiang.behaviormode.mediator;

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
