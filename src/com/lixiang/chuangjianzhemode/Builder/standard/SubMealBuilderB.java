package com.lixiang.chuangjianzhemode.Builder.standard;

public class SubMealBuilderB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("薯条");
    }

    @Override
    public void buildDrink() {
       meal.setDrink("雪碧");
    }
}
