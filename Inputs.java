package com.company;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Roll Number : ");
        int rollno = input.nextInt();
        System.out.println("Your rollno is "+rollno);

        float marks = input.nextFloat();
        System.out.println(marks);

        char surname = input.next().trim().charAt(0);
        System.out.println(surname);

        String name = input.nextLine();
        System.out.println(name);
    }
}
