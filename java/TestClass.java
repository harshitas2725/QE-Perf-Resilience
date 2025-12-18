package com.example;

import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
     Random random = new Random();
     int totalObjects = random.nextInt(6) + 5;
     for (int i = 1; i <= totalObjects; i++) {
        int choice = random.nextInt(4);
        switch (choice) {
            case 0:
                new Human().identify();
                    break;
            case 1:
                new Girl().identify();
                    break;
            case 2:
                new Boy().identify();
                    break;
            case 3:
                new Robot().identify();
                    break;
            }
        }
            


    



        Human h1 = new Human();
        Girl g1 = new Girl();
        Girl g2 = new Girl();
        Boy b1 = new Boy();
        Boy b2=new Boy();


        Robot r1 = new Robot();
        Robot r2 = new Robot();

        h1.identify();
        g1.identify();
        g2.identify();
        b1.identify();
        b2.identify();
        r1.identify();
        r2.identify();

        System.out.println("Total human population: " + Human.population);
    }
}

    

