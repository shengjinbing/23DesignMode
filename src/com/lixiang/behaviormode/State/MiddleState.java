package com.lixiang.behaviormode.State;

public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        this.acc = state.acc;
        this.point = state.getPoint();
        this.sateName = "中手";
    }
    public void writeNode(int score){
        System.out.println(acc.getName()+"发布留言，增加"+score+"*2积分");
        this.point+=score*2;
        checkState(score);
        System.out.println("积分剩余为："+this.point+"当前级别为"+acc.getState().getSateName()+".");
    }
    @Override
    public void checkState(int score) {
      if (point>=1000){
          acc.setState(new HighState(this));
      }else if (point <= 100){
          acc.setState(new PrimaryState(this));
      }else if (point < 0){
          System.out.println("余额不足，文件下载失败");
      }
    }
}
