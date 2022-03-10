package com.company.recursion;

public class Recursion_Sum0fDigits {
    public static void main(String[] args) {
        int n = 134;
        int ans = sumofdigits(n);
        System.out.println(ans);
    }
    public static int sumofdigits(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sumofdigits(n/10);
    }
}
