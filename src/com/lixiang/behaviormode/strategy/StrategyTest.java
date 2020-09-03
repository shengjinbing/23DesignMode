package com.lixiang.behaviormode.strategy;

/**
 * Created by Administrator on 2017/8/11 0011.
 * 策略（Strategy）模式：定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。
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
