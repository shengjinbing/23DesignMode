package com.lixiang.behaviormode.State;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public abstract class AbstractState {
    protected ForumAccount acc;
    protected int point;
    protected  String sateName;
    public abstract void checkState(int score );

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getSateName() {
        return sateName;
    }

    public void setSateName(String sateName) {
        this.sateName = sateName;
    }

    public void downloadFile(int score){
        System.out.println(acc.getName()+"下载文件，扣除"+score+"积分");
        this.point-=score;
        checkState(score);
    }

    public void writeNode(int score){
        System.out.println(acc.getName()+"发布留言，增加"+score+"积分");
        this.point+=score;
        checkState(score);
    }

    public void replyNode(int score){
        System.out.println(acc.getName()+"回复留言，增加"+score+"积分");
        this.point+=score;
        checkState(score);
    }
}
