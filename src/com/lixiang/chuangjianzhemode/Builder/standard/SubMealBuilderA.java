package com.lixiang.chuangjianzhemode.Builder.standard;

public class SubMealBuilderA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("鸡翅一个");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐一杯");
    }
}
