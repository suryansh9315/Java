package com.company;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int sum = 0;
        do{
            n = input.nextInt();
            sum+=n;
        }while(n>0);
        System.out.println(sum);
    }
}
