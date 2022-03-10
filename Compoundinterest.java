package com.company;

import java.util.Scanner;

public class Compoundinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double p = input.nextDouble();
        System.out.print("Enter Rate of Interest(In Decimals) : ");
        double r = input.nextDouble();
        System.out.print("Time Period : ");
        double t = input.nextDouble();
        System.out.print("Enter Total Comnpunding Iteration : ");
        double n = input.nextDouble();
        double nt = n*t;
        double rn = (1+(r/n));
        double ci = p*Math.pow(rn,nt);
        System.out.println("Future Value is : "+ci);
    }
}
