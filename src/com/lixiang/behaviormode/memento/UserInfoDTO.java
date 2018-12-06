package com.lixiang.behaviormode.memento;

/**
 * 源发器
 */
public class UserInfoDTO {
    private String account;
    private String password;
    private String telNo;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public Memento savaMemento(){
      return new Memento(account,password,telNo);
    }

    public void restoreMemento(Memento user){
        this.account = user.getAccount();
        this.password = user.getPassword();
        this.telNo = user.getTelNo();
    }

    public void  show(){
        System.out.println("account"+account);
        System.out.println("password"+password);
        System.out.println("telNo"+telNo);
    }
}
