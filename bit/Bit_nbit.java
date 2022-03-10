package com.company.bit;

public class Bit_nbit {
    public static void main(String[] args) {
        int num = 1000001;
        int n = 4;
        int ans = num & 1<<(n-1);
        System.out.println(ans>>(n-1));
    }
}
