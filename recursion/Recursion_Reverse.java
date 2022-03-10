package com.company.recursion;

public class Recursion_Reverse {
    public static void main(String[] args) {
        int n = 1345;
        System.out.println(Integer.valueOf(reverse(n)));
    }
    public static String reverse(int n){
        if(n % 10 == n){
            return String.valueOf(n);
        }
        return n%10 + reverse(n/10);
    }
}
