package com.company.recursion;

public class Recursion_Factorial {
    public static void main(String[] args) {
        int n = 13;
        int ans = facto(n);
        System.out.println(ans);
    }
    static int facto(int n){
        if(n==2 || n==1){
            return n;
        }
        if(n==0){
            return n+1;
        }
        return n*facto(n-1);
    }
}
