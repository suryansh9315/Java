package com.company;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        long n1 = input.nextLong();
        System.out.print("Enter Number you want to Count : ");
        int n2 = input.nextInt();
        int count = 0;
        while (n1>0){
            long rem = n1%10;
            if (rem==n2){
                count++;
            }
            n1=n1/10;
        }
        System.out.println(count);
    }
}
