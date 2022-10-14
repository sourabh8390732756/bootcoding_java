package com.bootcoding.oops;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        long st = System.nanoTime();

        Marker2 m2 = new Marker2();
        m2.setCompany("Natraj");
        m2.setType("Red Marker");
        m2.setColor("Black");
        m2.setPrice(126.00);

        System.out.println(m2.getCompany());
        System.out.println(m2.getType());
        System.out.println(m2.getColor());
        System.out.println(m2.getPrice());

      Dog a = new Dog();
      a.bark();
     // a.run();
      a.eat();
      a.sleep();

        long et = System.nanoTime();

        System.out.println(et-st/1000 +" micro seconds ");


    }
}
