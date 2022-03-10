package com.company.oops;
import java.util.Objects;
public class OOPS_1 {
    public static void main(String[] args) {
        Students one = new Students(29,93155664,"Suryansh Sharma");
        System.out.println(one.roll);
        System.out.println(one.phone);
        System.out.println(one.name);
        one.greeting();

        final int bonus = 8927819; // Value of bonus cannot be changed  (Always Initialised while Declaration)
    }
    public static class Students {
        int roll;
        int phone;
        String name;
        static int total;
        Students (int roll,int phone,String name){
            this.roll = roll;
            this.phone = phone;
            this.name = name;
            Students.total += 1;
        }
        void greeting(){
            System.out.println("Name is : "+this.name);
        }
    }
}

// A class is a named group of properties and functions. Class starts with a capital letters
// Every Class in java Inherits the Object Class
// To crate our own data type we use classes
// Object is an instance of a Class
// Instance Variables - Variables inside the object
// Constructor is a special function which runs when you create an object
// finalize method in a class is called when java is doing garbage collection
