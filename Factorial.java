package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fac = n;
        for (int i = 1;i<n;i++){
            fac = fac*(n-i);
        }
        System.out.println("Factorial of "+n+" is "+fac);
    }
}
