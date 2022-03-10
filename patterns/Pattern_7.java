package com.company.patterns;

public class Pattern_7 {
    public static void main(String[] args) {
        int n=5;
        method1(n);
        method2(n);
    }
    static void method1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void method2(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if ((i-j)<=0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
*****
 ****
  ***
   **
    *
 */
