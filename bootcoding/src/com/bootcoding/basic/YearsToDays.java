package com.bootcoding.basic;

public class YearsToDays {
   static int convert(int years ){
        int days=years*365;
        return days;
    }

    public static void main(String[] args) {
        int y = 23;
        int days = convert(y);
        System.out.println( y + " years" + " = " + days + " days ");


    }


}
