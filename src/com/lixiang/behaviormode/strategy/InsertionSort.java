package com.lixiang.behaviormode.strategy;

public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j;
            int temp = arr[i];
            for ( j = i; j > 0 ; j--) {
                if (temp < arr[j-1]){
                    arr[j] = arr[j-1];
                }else {
                    break;
                }
            }
            arr[j] = temp;
        }
        return arr;
    }
}
