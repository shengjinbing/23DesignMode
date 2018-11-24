package com.lixiang.behaviormode.chain;

/**
 * 总经理
 */
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeavaRequest request) {
        if (request.getLeaveDays() < 30){
            System.out.println("总经理"+name+"审批员工"+request.getLeaveName()+
                    "的请假条，请假天数为"+request.getLeaveDays()+"天。");
        }else {
            System.out.println("请假太久批不了");
        }
    }
}
