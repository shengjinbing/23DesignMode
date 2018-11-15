package com.lixiang.chuangjianzhemode.Builder.standard;

public class KFCWaiter {
    private MealBuilder builder;

    public void setBuilder(MealBuilder builder){
        this.builder = builder;
    }

    public Meal construct(){
        builder.buildFood();
        builder.buildDrink();
        return builder.getResult();
    }
}
