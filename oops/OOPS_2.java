package com.company.oops;
import static com.company.oops.OOPS_1.Students;
public class OOPS_2 {
    static int a = 8;
    static int b;
    static {    // only runs once
        b = a*6;
    }
    public static void main(String[] args) {
        Students three = new Students(34,8781,"Sutyj");
        Students rohan = new Students(4,81,"Rohan Kapoor");
        System.out.println(Students.total);
        System.out.println(Students.total);

        System.out.println(OOPS_2.a+" "+OOPS_2.b);

        OOPS_2 obj = new OOPS_2();
        System.out.println(OOPS_2.a+" "+OOPS_2.b);

        OOPS_2.b -=3;
        System.out.println(OOPS_2.a+" "+OOPS_2.b);

        OOPS_2 obj2 = new OOPS_2();
        System.out.println(OOPS_2.a+" "+OOPS_2.b);

    }
    public static class Book {
        int id;
        String name;
        String author;
        Book(int id,String name,String author){
            this.id = id;
            this.name = name;
            this.author = author;
        }
        void serialnumber(){
            System.out.println(this.id);
        }
    }
}


// Packages are Containers/Boxes For Classes
// we use static keyword to create static variables eg: varables which are common to all objects
// we use static so that we can use variables in a class without creating an object of that class
// Static variables/Methods belongs to the class
// A Static Method Can Only Access Static Data/Methods
// You Cannot Use this Keyword inside a static method
// Static Block only runs once when the class is loaded
// Singleton class are used to create only one instance/object of a class
