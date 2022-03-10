package com.company.recursion;

public class Recursion_ProductofDigits {
    public static void main(String[] args) {
        int n = 343;
        int ans = productofdigits(n);
        System.out.println(ans);
    }
    public static int productofdigits(int n){
        if(n == 0){
            return 1;
        }
        return n%10 * productofdigits(n/10);
    }
}
