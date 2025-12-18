package com.example;

public class car {
    String color;
    String transmission;
    int tyres;
    int doors;
    int make;
    public car(){
        tyres=4;
        doors=4;
    }
    public void displayCharacetristics(){
        System.out.println("Car Make"+make);
        System.out.println("Car color"+color);
        System.out.println("transmission"+transmission);
        System.out.println("Number of tyres"+tyres);
        System.out.println("Number of doors"+doors);
    }
    public void accelerate(){
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }
}
