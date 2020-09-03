package com.lixiang.chuangjianzhemode.Prototype.shallow;

/**
 * 浅复制
 */
public class ShallowMain {
    public static void main(String[] args) {
        Attachment attachment = new Attachment();
        Email      email      = new Email(attachment);
        Email      clone      = (Email) email.clone();
        //对象引用不同 false
        System.out.println(email == clone);
        //变量引用相同 true
        System.out.println(email.getAttachment() == clone.getAttachment());
    }
}
