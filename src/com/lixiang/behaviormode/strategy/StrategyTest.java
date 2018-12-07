package com.lixiang.behaviormode.strategy;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public class StrategyTest {
    /**
     * 策略模式
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,0,2,9,8,3,7,6,5};
        ArrayHandler arrayHandler = new ArrayHandler();
        //arrayHandler.setSortObj(new BubbleSort());
        //arrayHandler.setSortObj(new SelectionSort());
        arrayHandler.setSortObj(new InsertionSort());
        arrayHandler.sort(arr);
        print(arr);
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
