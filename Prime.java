package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n2 = 2;
        System.out.print("Enter the Number : ");
        int n1 = input.nextInt();
        if (n1<=1){
            System.out.println("Neither Prime Nor Composite");
        }
        else{
            while (n2*n2<=n1){
                if (n1%n2==0){
                    System.out.println("Not Prime");
                    return;
                }
                n2++;
            }
            if (n2*n2>n1){
                System.out.println("Prime");
            }
        }
    }
}
