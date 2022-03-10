package com.company;

public class Datatypes {
    public static void main(String[] args) {
        // Primitive Data Types
        int rollno = 45;                               // Size = 4 bytes
        char last = 'h';                               // Size = 2 bytes
        float marks = 34.5f;                           // Size = 4 bytes
        double longdecimal = 67623876.647236;          // Size = 8 bytes
        long longinteger = 356756224L;                 // Size = 8 bytes
        boolean value = false;                         // Size = 1 bit
// primitives are stored in stack memory
// objects are stored in heap memory
        System.out.println("Your Roll Number is "+rollno);
        System.out.println("last character is "+last);
        System.out.println("Your Marks are "+marks);
        System.out.println(longdecimal);
        System.out.println(longinteger);
        System.out.println(value);

        // Non-Primitive
        String name = "Suryansh Sharma";
        System.out.println("Your Name is "+name);
    }
}
