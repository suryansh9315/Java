package com.company.oops.ObjectCloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{23,34,45,56,67,78,89,90};
    }

    public Human(Human human) {
        this.age = human.age;
        this.name = human.name;
        this.arr = new int[]{23,34,45,56,67,78,89,90};
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        // This is Shallow Copying
//        return super.clone();
//    }
//
    @Override
    public Object clone() throws CloneNotSupportedException {
        // This is Deep Copying
        Human twin = (Human)super.clone(); // Shallow Copying
//        Making a Deep Copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
