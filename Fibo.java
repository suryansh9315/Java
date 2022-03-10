package com.company;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i=0;i<n;i++){
            if (i<=1){
                c = i;
            }
            else{
                c = a + b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
    }
}
