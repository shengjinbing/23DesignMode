package com.lixiang.chuangjianzhemode.Builder.standard;

public abstract class MealBuilder {
    public Meal meal = new Meal();
    public abstract void buildFood();
    public abstract void  buildDrink();

    public Meal getResult(){
        return meal;
    }
}
