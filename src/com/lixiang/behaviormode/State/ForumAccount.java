package com.lixiang.behaviormode.State;

/**
 * 环境类（论坛账号类）
 */
public class ForumAccount {
    private AbstractState state;
    private String name;

    public ForumAccount(String name) {
        this.name = name;
        state = new PrimaryState(this);
        System.out.println("创建新手账号");

    }
    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void downloadFile(int score){
        state.downloadFile(score);
    }

    public void writeNode(int score){
        state.writeNode(score);
    }

    public void replyNode(int score){
        state.replyNode(score);
    }
}
