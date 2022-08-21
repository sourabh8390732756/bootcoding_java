package com.bootcoding.basic;

public class MinutesToSeconds {
    static int convert(int m){
        int seconds= m*60;
        return seconds;
    }

    public static void main(String[] args) {
        int min = 15;
        int convert = convert(min);


        System.out.println(min + " minutes: "  +  " -> " + convert + " seconds ");
        System.out.println(min + " minutes " +" is " + convert + " seconds");
        System.out.println(" Input was " + min + " minutes " + "," + " Output is " + convert + " seconds ");


     // 15 minutes is 900 seconds
        // minutes:15 -> seconds:900
        // Input was 15 minutes, output is 900 seconds


    }
}
