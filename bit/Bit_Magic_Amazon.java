package com.company.bit;

public class Bit_Magic_Amazon {
    public static void main(String[] args) {
        int n = 6;
//        int ans = Normal(n);
        int ans = Advance(n);
        System.out.println(ans);
    }
    public static int Advance(int n){
        int base = 1;
        int sum = 0;
        while(n>0){
            int rem = n & 1;
            sum+= rem * Math.pow(5,base);
            n = n>>1;
            base++;
        }
        return sum;
    }
    public static int Normal(int n){
        int sum = 0;
        int base = 1;
        while(n>0){
            int rem = n %2;
            sum+= rem * Math.pow(5,base);
            n=n/2;
            base++;
        }
        return sum;
    }
}
