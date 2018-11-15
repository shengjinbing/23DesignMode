package com.lixiang.chuangjianzhemode.Builder.standard;

public class StandardMain {
    /**
     * 标准的建造者模式
     *
     * @param args
     */
    public static void main(String[] args) {
        KFCWaiter kfcWaiter = new KFCWaiter();
        kfcWaiter.setBuilder(new SubMealBuilderA());
        Meal meal = kfcWaiter.construct();
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}
