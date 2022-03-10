package com.company;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        int n = 36;
//        method1(n);
        method2(n);
    }
    public static void method1(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i);
                }else{
                    System.out.println(i);
                    System.out.println(n/i);
                }
            }
        }
    }
    public static void method2(int n){
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
