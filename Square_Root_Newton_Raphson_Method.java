package com.company;

public class Square_Root_Newton_Raphson_Method {
    public static void main(String[] args) {
        double n = 87;
        double x = n;
        double r = (x + (n/x))/2;
        while(Math.abs(r-x)>0.4){
            x--;
            r = (x + (n/x))/2;
        }
        System.out.println(r);
    }
}
