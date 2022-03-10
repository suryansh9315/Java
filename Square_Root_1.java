package com.company;

public class Square_Root_1 {
    public static void main(String[] args) {
        int x = 40;
        int p = 3;
        double ans = mySqrt(x,p);
        System.out.println(ans);
    }
    public static double mySqrt(int x,int p) {
        int n=1;
        int l=x;
        double ans=0;
        if(x==0 || x==1){
            return x;
        }
        while(n<=l){
            int mid=(n+l)/2;
            if(mid*mid==x){
                return mid;
            }
            if(mid*mid<x){
                n=mid+1;
                ans=mid;
            }else{
                l=mid-1;
            }
        }
        double inc = 0.1;
        for(int i=0;i<p;i++){
            while(ans*ans<=x){
                ans+=inc;
            }
            ans -=inc;
            inc /=10;
        }
        return ans;
    }
}
