package com.lixiang.chuangjianzhemode.Prototype.shallow;

public class ShallowMain {
    public static void main(String[] args) {
        Attachment attachment = new Attachment();
        Email      email      = new Email(attachment);
        Email      clone      = (Email) email.clone();
        System.out.println(email == clone);
        System.out.println(email.getAttachment() == clone.getAttachment());
    }
}
