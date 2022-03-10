package com.company.oops.Polymorphism;

public class Circle extends Shapes{

    // Overriding the parent method
    @Override // To check if a method is overrided (This is called Annotation)
    void Area(){
        System.out.println("Area is 2.14 * r * r");
    }
}
