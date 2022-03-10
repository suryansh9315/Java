package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while (num>0){
            int rem = num%10;
            sum = sum*10 + rem;
            num=num/10;
        }
        System.out.println("Reversed number is "+sum);
    }
}
