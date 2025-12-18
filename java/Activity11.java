package com.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;

public class Activity11 {
    


    public static void main(String[] args) {
        Map<Integer, String> colours = new HashMap<>();
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Green");
        colours.put(4, "Yellow");
        colours.put(5, "Purple");

        System.out.println("Initial Map: " + colours);

        String removedColour = colours.remove(4); // Remove Yellow
        System.out.println("Removed colour: " + removedColour);

    
        boolean hasGreen = colours.containsValue("Green");
        System.out.println("Does the Map contain 'Green'? " + hasGreen);

     
        System.out.println("Size of Map: " + colours.size());

    
        System.out.println("Updated Map: " + colours);
        System.out.println("Iterating Map using Iterator:");
        Iterator<Entry<Integer, String>> iterator = colours.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
    }
}

    

