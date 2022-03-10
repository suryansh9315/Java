package com.company.patterns;

public class Pattern_4 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            System.out.println();
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
        }
        for (int i=0;i<4;i++){
            System.out.println();
            for (int j=0;j<4-i;j++){
                System.out.print("*");
            }
        }
    }
}
/*
*
**
***
****
*****
****
***
**
*
 */
