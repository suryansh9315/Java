package com.company.patterns;

public class Pattern_8 {
    public static void main(String[] args) {
        int n=5;
        method1(n);
        method2(n);
        method3(n);
    }
    static void method1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            for (int l=0;l<n-1-i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void method2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) >= (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void method3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n; j++) {
                if (j>=n-1-i && j<=n-1+i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/*
     *
    ***
   *****
  *******
 *********
 */
