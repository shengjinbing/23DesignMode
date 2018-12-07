package com.lixiang.behaviormode.strategy;

public class ArrayHandler {
    private Sort sortObj;

    public void setSortObj(Sort sortObj) {
        this.sortObj = sortObj;
    }

    public int[] sort(int[] arr){
        sortObj.sort(arr);
        return arr;
    }
}
