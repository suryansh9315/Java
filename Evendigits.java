package com.company;

public class Evendigits {
    public static void main(String[] args) {
        int[] arr = {23,456,2,789,3334,33333,989753,23,0,-23};
        int n2=0;
        for (int j : arr) {
            if (j<0){
                j=j*-1;
            }
            int n = 0;
            int num = j;
            while (num > 0) {
                n++;
                num = num / 10;
            }
            if (j==0){
                n=1;
            }
            if (n % 2 == 0) {
                n2++;
            }
            System.out.println(n);
        }
        System.out.println("Number of Integers with Even Number of Digits is "+n2);
        System.out.println(count(-34448947));
    }
    static int count(int num){
        if (num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
}

