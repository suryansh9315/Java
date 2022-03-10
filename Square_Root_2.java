package com.company;

public class Square_Root_2 {
    public static void main(String[] args) {
        int x=11;
        int ans =mySqrt(x);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
        int i=1;
        while(i<=x/i){
            i++;
        }
        return i-1;
    }
}
