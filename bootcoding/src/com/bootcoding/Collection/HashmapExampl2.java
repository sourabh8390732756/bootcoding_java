package com.bootcoding.Collection;

import java.util.HashMap;

public class HashmapExampl2 {
    public static void main(String[] args) {

        int[] a ={5,10,100,10,10,10,1000,10001,56,25,23,32,32,32,5,5,1000,1000};
        HashmapExampl2 hashmapExampl2 = new HashmapExampl2();

        System.out.println(hashmapExampl2.findDuplicates(a));

    }
    public int findDuplicates(int[] arr){

        HashMap<Integer,Integer>  countMap= new HashMap<>();
        int n = arr.length;
        for (int i=0; i<n;i++) {
            if (countMap.containsKey(arr[i])) {
                int v = countMap.get(arr[i]);
                countMap.put(arr[i], v + 1);

            } else {
                countMap.put(arr[i], 1);
            }
        }
        int count = 0;
        for (Integer value : countMap.values()){
            if (value>1 ){
                count++;
            }
        }
        return count;

    }
}
