package com.company.oops.ExceptionHandling;

public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Fuck You Bitch";
    }
}
