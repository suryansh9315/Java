package com.company.bit;

public class Bit_XOR {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,4,3,2};
        int ans = 0 ;
        for(int n : arr){
            ans ^= n;
        }
        System.out.println(ans);
    }
}
