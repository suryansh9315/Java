package com.company;

import java.sql.Array;
import java.util.Scanner;

public class Prime_n {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 0; i < n; i++) {
            if (method1(i + 1)) {
                System.out.println(i + 1);
            }
        }
    }
    public static boolean method1(int n1){
        int n2 = 2;
        if (n1<=1){
            return false;
        }
        else{
            while (n2*n2<=n1){
                if (n1%n2==0){
                    return false;
                }
                n2++;
            }
            return n2 * n2 > n1;
        }
    }
}
