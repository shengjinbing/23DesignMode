package com.lixiang.behaviormode.State;

/**
 * Created by Administrator on 2017/8/11 0011.
 * 状态（State）模式：允许一个对象在其内部状态发生改变时改变其行为能力。
 */
public class Test {
    public static void main(String[] args) {
        ForumAccount account = new ForumAccount("张三");
        account.writeNode(20);
        account.downloadFile(20);
        account.replyNode(100);
        account.writeNode(40);
        account.downloadFile(150);
        account.writeNode(1000);
        account.downloadFile(80);
    }
}
