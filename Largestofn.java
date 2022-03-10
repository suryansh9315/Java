package com.company;

import java.util.Scanner;

public class Largestofn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int max = 1;
        do {
            n = input.nextInt();
            if (max<n){
                max=n;
            }
        } while (n > 0);
        System.out.println(max);
    }
}