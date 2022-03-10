package com.company.recursion;

public class Recursion_Fibo {
    public static void main(String[] args) {
        int n=7;
        int ans = fibo(n);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
