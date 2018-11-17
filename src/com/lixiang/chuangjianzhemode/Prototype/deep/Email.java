package com.lixiang.chuangjianzhemode.Prototype.deep;

import com.lixiang.chuangjianzhemode.Prototype.shallow.Attachment;

import java.io.*;

public class Email implements Serializable {
    private Attachment attachment;

    public Email(Attachment attachment) {
        this.attachment = attachment;
    }

    public Object deepclone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream    objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream    objectInputStream = new ObjectInputStream(inputStream);
        return objectInputStream.readObject();
    }
    public void display(){
        System.out.println("发送邮件");
    }
    public Attachment getAttachment(){
        return attachment;
    }
}
