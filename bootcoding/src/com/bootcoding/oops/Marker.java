package com.bootcoding.oops;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Marker {
    String company;
    String color;
    String type;
    double price;

    public void fillMarker(){
        System.out.println("FillMarker");

    }
    public Marker(){
        System.out.println("Marker object created" );
    }
      public Marker(String cmp,String clr,String t,double p){
        company = cmp;
        color = clr;
        type = t;
        price = p;
      }



    public static void main(String[] args) {
        Marker m1 = new Marker();
        m1.color = "Black";
        m1.company ="Camlin";
        m1.type = "White Marker";
        m1.price = 127.00;
        System.out.println(m1.color);
        System.out.println(m1.company);
        System.out.println(m1.type);
        System.out.println(m1.price);

        Marker m2 = new Marker();
        m2.color = "Blue";
        m2.company ="Natraj";
        m2.type = "Black Marker";
        m2.price = 135.00;
        System.out.println(m2.color);
        System.out.println(m2.company);
        System.out.println(m2.type);
        System.out.println(m2.price);

        Marker m3 = new Marker();
        m3.color = "Red";
        m3.company ="Apsara";
        m3.type = "Green Marker";
        m3.price = 132.00;
        System.out.println(m3.color);
        System.out.println(m3.company);
        System.out.println(m3.type);
        System.out.println(m3.price);

        Marker m4 = new Marker("Natraj","Black","White",127.00);

        System.out.println(m4.color);
        System.out.println(m4.company);
        System.out.println(m4.type);
        System.out.println(m4.price);






    }
}
