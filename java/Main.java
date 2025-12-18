package com.example;

public class Main {
    static void exceptionTest(String value) throws CustomException{
        if (value==null){
            throw new CustomException("String value is null");
        }
        else{
            System.out.println(value);
        }
    }
    public static void main(String[] args) {
        try {
            // Non-null string
            exceptionTest("Hello World");
            // Null string (will throw exception)
            exceptionTest(null);
        } catch (CustomException e) {
            // Print custom error message
            System.out.println(e.getMessage());
        }
    }

    
}
