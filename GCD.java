package com.company;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gdcdd(5,7));
        lcm(5,7);
    }
    public static int gdcdd(int a,int b){
        if(a==0){
            return b;
        }
        return gdcdd(b%a,a);
    }
    public static void lcm(int a,int b){
        int lcm = (a*b)/gdcdd(a,b);
        System.out.println(lcm);
    }
}
