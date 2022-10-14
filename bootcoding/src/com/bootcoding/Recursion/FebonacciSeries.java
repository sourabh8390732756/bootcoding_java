package com.bootcoding.Recursion;

public class FebonacciSeries {
    public int fib (int n){
        if (n<=1){
            return n;
        }
        return fib(n-1)+ (n-2);

    }

    public static void main(String[] args) {
        FebonacciSeries f = new FebonacciSeries();
       int res = f.fib(5);
        System.out.println(res);
    }
}
