package com.bootcoding.Collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String,String>emailids=new HashMap<>();
        emailids.put("std-123","IamCoder@gmail.com");
        emailids.put("std-333","Iamjavadeveloper@gmail.com");

        String value = emailids.get("std-333");
        System.out.println("value of std-333 ="+value);
    }
}
