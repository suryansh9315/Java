package com.company.oops.Inheritance;

public class OOPS_3 {
    public static void main(String[] args) {
        int side = 20;
        Box box = new Box(10,20,40);
//        System.out.println("Length : "+box.l);
        System.out.println("Breadth : "+box.b);
        System.out.println("Height : "+box.h);

        Box_Inheritance box2 = new Box_Inheritance();
        System.out.println("Height : "+box2.h);
        System.out.println("Weight : "+box2.weight);

        Box_Inheritance box3 = new Box_Inheritance(23,45,56,100);
        System.out.println("Height : "+box3.h);
        System.out.println("Weight : "+box3.weight);

        Box box4 = new Box_Inheritance(10,10,10,100);
        System.out.println("Height : "+box4.h);
        // System.out.println("Weight : "+box4.weight); // Can not Access weight Because reference variable is of Box

//        Box_Inheritance box5 = new Box(10,10,10);
//        Cannot Call constructor of child from parent i.e. width is not initialised

        Box_In2 box6 = new Box_In2();
        System.out.println(box6.gravity);
        System.out.println(box6.weight);

        Box_In2 box7 = new Box_In2(10,10,10,100);
        System.out.println(box7.gravity);
        System.out.println(box7.weight);
//        System.out.println(box6.l);
        System.out.println(box7.h);
        System.out.println(box7.b);

        Box box8 = new Box_In2();
        System.out.println(box8.h);
        System.out.println(box8.b);
    }
}
// Object Oriented Language has 4 Properties:
// Inheritance
// Polymorphism
// Encapsulation
// Abstraction


// Anything that is private we can only use it in that file
// It is not the type of object but the type of reference variable that determines what can be accessed inside that object

// Types of Inheritance
// 1. Single Inheritance -> one Class extends other class
// 2. Multilevel Inheritance -> One class extents other class which also extends other class.
// 3. Multiple Inheritance -> One class extends from more than one class  -> Not Allowed in Java
// 4. Hierarchial Inheritance -> One class is Inherited By Many Classes
// 5. Hybrid Inheritance -> Single + Multiple Inheritance -> Not Supported in Java

