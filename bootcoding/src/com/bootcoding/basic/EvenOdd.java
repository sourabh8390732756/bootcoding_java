package com.bootcoding.basic;

public class EvenOdd {

    void start(){

        System.out.println("start");
    }

    public static void main (String[]args)
    {
        System.out.println("Enter a number:");
        int num = 10;
        if(num% 2 == 0)
            System.out.println(num + "is even");
        else
            System.out.println(num + "is odd");


    }
}
