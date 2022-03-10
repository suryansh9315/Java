package com.company.oops.Polymorphism;

public class OOPS_4 {
    public static void main(String[] args) {
        Shapes shape1 = new Shapes();
        Circle circle1 = new Circle();
        Square square1 = new Square();

        shape1.Area();
        circle1.Area();
        square1.Area();

        Shapes square2 = new Square();
        square2.Area();

    }
}

// Polymorphism  ->  Many ways to represent
// Types of Polymorphism
// 1. Compile-Time/Static Polymorphism  -> Achieved by Method Overloading -> Same name but type,return type,arguments,ordering can be different
// 2. Runtime/Dynamic Polymorphism -> Achieved by Method Overriding -> Same function in Parent and Child Class then child class overrides the function in parent class
//    Dynamic Method Dispatch -> It is a mechanism by which a call to an overriden method is resolved at runtime.
//  cannot override a method that is final
//  final keyword helps in early binding
//  we also use final to avoid inheritance
//  Whenever you make a class final then all its method are also declared final
//  We Cannot Override static methods
//  Overriding Depends on Object -- Static does not Depends on Object  -> Therefore we cannot override static methods


// Encapsulation -> Wrapping Up the implementation of data members and methods in a class.
// Abstraction -> Hiding unnecessary details and showing valuable information

// Abstraction is solving a design level issue and Encapsulation is solving an implementation level issue
// Abstraction is a process of gaining information and Encapsulation is a process of containing information
