package com.company.recursion;

public class Recursion_Pattern_1 {
    public static void main(String[] args) {
        int num = 6;
//        triangle(0,0,num);
        triangle2(num,0);
    }
    public static void triangle(int r,int c,int n){
        if(n==0){
            return;
        }
        if(c==n){
            System.out.println();
            triangle(r+1,0,n-1);
            return;
        }
        System.out.print("*");
        triangle(r,c+1,n);
    }
    public static void triangle2(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            triangle2(r,c+1);
        }
        if(r==c){
            System.out.println();
            triangle2(r-1,0);
        }
    }
}
// ****
// ***
// **
// *
