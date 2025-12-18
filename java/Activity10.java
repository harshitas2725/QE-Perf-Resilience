package com.example;
import java.util.HashSet;
import java.util.Iterator;
public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Banana");
        hs.add("Litchi");
        hs.add("Kiwi");
        System.out.println("Initial size of hashset: "+hs.size());
        boolean removed=hs.remove("Mango");
        System.out.println("item removed"+removed);
        boolean removed2=hs.remove("pineapple");
        System.out.println("item removed"+removed2);
        System.out.println("Does HashSet contain 'Mango'? " + hs.contains("Mango"));
        System.out.println("Does HashSet contain 'Pineapple'? " + hs.contains("Pineapple"));

        
        System.out.println("Updated HashSet: " + hs);

        System.out.println("Iterating using Iterator:");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
    }

    
    }
}
