package com.lixiang.chuangjianzhemode.Prototype.shallow;

public class Email implements Cloneable{
    private Attachment attachment;

    public Email(Attachment attachment) {
        this.attachment = attachment;
    }

    public Object clone(){
        Email email = null;
        try {
            email = (Email)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return email;
    }
    public void display(){
        System.out.println("发送邮件");
    }
    public Attachment getAttachment(){
        return attachment;
    }
}
