package com.company.string;

public class Stringbasics {
    public static void main(String[] args) {
        String name = "Suryansh Sharma";
        System.out.println(name);
        String name2 = "Suryansh Sharma";
        String n1 = new String("jod");
        String n2 = new String("jod");
        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));
        System.out.println(name==name2);
        System.out.println(name.equals(name2));
    }
}
// Strings are Stored in Stringpool(which is a seperate section in heap memory)
// all similar values of string are created only once
// whenever you create a new string it first checks that if it exists in the stringpool, ifnot then java creates
//   that string inside the string pool.
// To create string outside stringpool you have to use new keyword
// Strings are Immutable in Java.
//    == method  :  checks if reference variables are pointing to same objects and have same value
//   .equals() method  :  checks if reference variable have same values
// when you print anything in java it calls toString() method internally
