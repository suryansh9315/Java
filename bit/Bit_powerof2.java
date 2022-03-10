package com.company.bit;

public class Bit_powerof2 {
    public static void main(String[] args) {
        int n = 0;
        boolean ans = method1(n);
        System.out.println(ans);
    }
    public static boolean method1(int n){
        if(n==0){
            return false;
        }
        return (n & (n-1)) == 0;
    }
    public static boolean method2(int n){
        int count = 0;
        while(n>0){
            int rem = n%2;
            if(rem == 1){
                count++;
            }
            n=n/2;
        }
        return count == 1;
    }
}
