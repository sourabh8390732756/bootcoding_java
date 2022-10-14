package com.bootcoding.Recursion;

public class FactRecursion {
    public int factorial (int num){
        if (num ==1){
            return 1;
        }
        return num * factorial(num-1);
    }

    public static void main(String[] args) {
        FactRecursion f = new FactRecursion();
       int res= f.factorial(5);
        System.out.println(res);
    }

}
