package com.company.oops.Generics.ObjectCompare;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student Saini = new Student(50,24);
        Student Vineet = new Student(110,40);
        Student Abhigyan = new Student(80,1);
        Student Subodh = new Student(100,25);
        Student Aditya = new Student(0,7);

        Student[] list = {Saini,Vineet,Abhigyan,Aditya,Subodh};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list); // Sorted On Basis of Marks Because of compareTo method

        System.out.println(Arrays.toString(list));

//        if(Ram > Shyam){
//            System.out.println("Ram Has More Marks");
//        }
        if(Saini.compareTo(Vineet) > 0){
            System.out.println("Ram Has More Marks");
        }else if(Saini.compareTo(Vineet) < 0){
            System.out.println("Shyam Has More Marks");
        }else{
            System.out.println("Both has Equal Marks");
        }
    }
}
