package com.company;

import java.util.Scanner;

public class DTB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deci = input.nextInt();
        double sum = 0;
        double base = 0;
        int rem;
        while(deci>0){
            rem = deci%2;
            sum = sum + rem*Math.pow(10,base);
            deci = deci/2;
            base++;
        }
        System.out.println("Corresponding Binary Number is "+sum);
    }
}
