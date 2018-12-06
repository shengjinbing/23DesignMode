package com.lixiang.behaviormode.mediator;

import java.util.Hashtable;

/**
 * 具体聊天室类
 */
public class ChatGroup extends AbstractChatRoom{
    Hashtable<String,Member> members = new Hashtable();

    public void register(Member member){
        if (!members.contains(member)){
            members.put(member.getName(),member);
            member.setChatRoom(this);
        }
    }

    @Override
    public void sendText(String from, String to, String message) {
        Member member = members.get(to);
        String newMessage = message;
        newMessage.replace("日","*");
        member.receiveText(from,message);
    }

    @Override
    public void sendImage(String from, String to, String image) {
        Member member = members.get(to);
          if (image.length() > 15){
              System.out.println("图片过大");
          }else {
              member.receiveImage(from,image);
          }
    }
}
