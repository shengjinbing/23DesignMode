package com.lixiang.behaviormode.State;

public class PrimaryState extends AbstractState {
    public PrimaryState(AbstractState state) {
        this.acc = state.acc;
        this.point = state.getPoint();
        this.sateName = "新手";
    }

    public PrimaryState(ForumAccount fa) {
        this.acc = fa;
        this.point = 0;
        this.sateName = "新手";
    }
    public void downloadFile(int score){
        System.out.println(acc.getName()+"没有下载文件权限");
    }

    @Override
    public void checkState(int score) {
        if (point >= 1000){
            acc.setState(new HighState(this));
        }else if (point >= 100){
            acc.setState(new MiddleState(this));
        }
    }
}
