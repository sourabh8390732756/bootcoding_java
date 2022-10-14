package com.bootcoding.dsa;

public class NumberOfSteps {
    public static void main(String[] args) {
        int count = 0;
        int num = 14;
        while(num>0){
            if (num % 2 == 0){
                num /=2;
            }
            else {
                num-=1;
            }
            count++;
        }

        System.out.println(count);
    }
}
