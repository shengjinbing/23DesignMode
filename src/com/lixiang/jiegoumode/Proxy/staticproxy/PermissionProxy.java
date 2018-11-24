package com.lixiang.jiegoumode.Proxy.staticproxy;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class PermissionProxy implements AbstractPermission {
    private RealPermission permission = new RealPermission();
    private int            level      = 0;

    @Override
    public void modifyUserInfo() {
        if (level == 0){
            System.out.println("对不起，您没有该权限！");
        }else if (level == 1){
            permission.modifyUserInfo();
        }
    }

    @Override
    public void viewNote() {
       permission.viewNote();
    }

    @Override
    public void publishNote() {
        if (level == 0){
            System.out.println("对不起，您没有该权限！");
        }else if (level == 1){
            permission.publishNote();
        }
    }

    @Override
    public void modifyNote() {

    }

    @Override
    public void setLevel(int level) {
       this.level = level;
    }
}
