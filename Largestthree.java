package com.company;

import java.util.Scanner;

public class Largestthree {
    public static void largest1(int a, int b, int c){
        if (a>b&&a>c){
            System.out.println(a+" is the largest number.");
        }
        else if(b>c){
            System.out.println(b+" is the largest number.");
        }
        else {
            System.out.println(c + " is the largest number");
        }
    }
    public static void largest2(int a,int b,int c){
        int max = a;
        if (b>a){
            max = b;
        }
        if (c>b){
            max = c;
        }
        System.out.println(max+" is the largest number.");
    }
    public static void largest3(int a,int b,int c){
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max+" is the largest number.");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = input.nextInt();
        System.out.print("Enter Second Number : ");
        int b = input.nextInt();
        System.out.print("Enter Third Number : ");
        int c = input.nextInt();
//        largest1(a,b,c);
        largest2(a,b,c);
//        largest3(a,b,c);
    }
}
