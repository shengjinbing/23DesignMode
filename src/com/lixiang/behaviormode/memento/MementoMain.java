package com.lixiang.behaviormode.memento;

/**
 * 备忘录（Memento）模式：在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。
 */
public class MementoMain {
    public static void main(String[] args) {
        UserInfoDTO user = new UserInfoDTO();
        Caretaker   c = new Caretaker();
        user.setAccount("123456");
        user.setPassword("111111");
        user.setTelNo("13161931011");
        user.show();
        //保存备忘录
        c.setMemento(user.savaMemento());
        user.setAccount("123457");
        user.setPassword("111112");
        user.setTelNo("13161931012");
        user.show();

        user.restoreMemento(c.getMemento());
        user.show();
    }
}
