package com.lixiang.behaviormode.chain;

/**
 *
 * 责任链模式 -- OkHttp拦截器
 * 假条审批
 */
public class ChainMain {
    public static void main(String[] args) {
        Leader director, manager, generalManager;
        director = new Director("王明");
        manager = new Manager("赵强");
        generalManager = new GeneralManager("李波");

        director.setSuccessor(manager);
        manager.setSuccessor(generalManager);

        LeavaRequest zhangsan = new LeavaRequest("张三", 2);
        LeavaRequest lisi       = new LeavaRequest("李四", 5);
        LeavaRequest wangwu       = new LeavaRequest("王五", 15);
        LeavaRequest zhaoliu       = new LeavaRequest("赵六", 45);

        director.handleRequest(zhangsan);
        director.handleRequest(lisi);
        director.handleRequest(wangwu);
        director.handleRequest(zhaoliu);

    }
}
