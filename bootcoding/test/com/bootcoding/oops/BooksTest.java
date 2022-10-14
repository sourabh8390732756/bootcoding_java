package com.bootcoding.oops;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class BooksTest {

    @Test
    public  void test2(){
        Books b = new Books();
        int actualResult = b.add(10, 70);

        int expectedResult = 80;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public  void test3(){
        Books b = new Books();
        int actualResult = b.add(10, -70);

        int expectedResult = -60;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public  void test4(){

        Books bk = new Books();
        int actualResult = bk.add(10, 40);

        int expectedResult = -60;

        Assert.assertEquals(expectedResult, actualResult);
    }



    @Test
    public void test1(){

        Books javaBook = new Books();
        javaBook.setTitle("The Complete Reference in Java");

        System.out.println(javaBook.title);



        String expected = "The Complete Reference in Java";
//
        Assert.assertEquals(expected, javaBook.getTitle() );


    }


}
