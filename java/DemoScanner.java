package com.example;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String user=sc.nextLine();
        System.out.println("Username is: "+user);
    }
    
}
