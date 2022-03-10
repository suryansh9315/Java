package com.company.bit;

public class Bit_Numberofsetbits {
    public static void main(String[] args) {
        int n = 9;
        int ans = method(n);
        System.out.println(ans);
    }
    public static int method(int n){
        int count = 0;
        while(n>0){
            int rem = n%2;
            if(rem == 1){
                count++;
            }
            n=n/2;
        }
        return count;
    }
}
