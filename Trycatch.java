package com.company;

public class Trycatch {
    public static void main(String[] args) {
        int[] marks = {34,56,67,78};
        try {
            System.out.println(marks[5]);
        }catch(Exception exception){
            // Do something after catching
        }
        System.out.println("Try & Catch Exception Handling");
    }
}
