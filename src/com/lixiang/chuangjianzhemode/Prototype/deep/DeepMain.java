package com.lixiang.chuangjianzhemode.Prototype.deep;

import com.lixiang.chuangjianzhemode.Prototype.shallow.Attachment;

import java.io.IOException;

/**
 * 深拷贝
 */
public class DeepMain {
    public static void main(String[] args) {
        Attachment attachment = new Attachment();
        Email      email      = new Email(attachment);
        try {
            Email     deepclone  = (Email)email.deepclone();
            //false
            System.out.println(email == deepclone);
            //false
            System.out.println(email.getAttachment() == deepclone.getAttachment());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
