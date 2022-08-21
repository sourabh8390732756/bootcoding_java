package com.bootcoding.basic;

public class Laptop {

    String color;
    int size;
    float price;
    String unit;
    String getColor(){
        return color;
    }
    void start() {
        System.out.println("start");
    }

    public static void main(String[] args) {
        Laptop hp = new Laptop();
        Laptop asus = new Laptop();
        hp.color="RED";
        hp.size=15;

    }
}
