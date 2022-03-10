package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int first = input.nextInt();

        System.out.println("Enter Second Number : ");
        int second = input.nextInt();

        int third = first + second;
        System.out.println("Sum is "+third);

    }
}
