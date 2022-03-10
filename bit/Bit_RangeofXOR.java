package com.company.bit;

public class Bit_RangeofXOR {
    public static void main(String[] args) {
        int n = 6;
        int ans = xor(n);
        System.out.println(ans);
        int a = 3;
        int b = 9;
        int ans2 = xoratob(a,b);
        System.out.println(ans2);
    }
    public static int xoratob(int a,int b){
        return xor(b)^xor(a-1);
    }
    public static int xor(int n){
        if(n % 4==0){
            return n;
        }
        if(n % 4==1){
            return 1;
        }if(n % 4==2){
            return n+1;
        }
        return 0;
    }
}
