package com.company.patterns;

public class Pattern_9 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j>=i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k=0;k<n-i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
*********
 *******
  *****
   ***
    *
 */
