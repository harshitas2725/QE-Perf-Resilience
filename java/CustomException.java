package com.example;



public class CustomException extends Exception {
    private String message=null;
    public CustomException(String message1){
        this.message=message1;
    }
    @Override
    public String getMessage(){
        return message;
    }
}