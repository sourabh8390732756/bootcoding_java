package com.bootcoding.basic;

public class FeetToCentimeter {
    static double convert(double feet){
        double centimeter = feet*30.48;
        return centimeter;


    }

    public static void main(String[] args) {
        double feet = 5;
        double centimeter = convert(feet);
        System.out.println( feet + " feet " + " = " + centimeter + " centimeter " );
    }


}
