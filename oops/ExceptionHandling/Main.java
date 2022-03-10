package com.company.oops.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//            int c = a/b;
//            divide(a,b);
            throw new MyException("Jodddddd");
        }catch(MyException | ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }
    }
    static int divide(int a ,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Cannot Divide By 0 Bitch");
        }
        return a/b;
    }
}

// throws -> it may throw an exception
// throw  -> throw this exception
