package com.example;
import java.util.Map;
import java.util.HashMap;


public class demomaps {

    public static void main(String[] args) {
        Map<String,Integer> num=new HashMap<>();
        num.put("one",1);
        num.put("two",2);
        System.out.println("Maps"+num);
        System.out.println("key:"+num.keySet());
        System.out.println("Values: " + num.values());
 
      
        System.out.println("Entries: " + num.entrySet());
 
     
        int value = num.remove("Two");
        System.out.println("Removed Value: " + value);



    }
    
}
