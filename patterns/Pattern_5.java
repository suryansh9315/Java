package com.company.patterns;

public class Pattern_5 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            System.out.println();
            for (int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
        }
    }
}
/*
1
12
123
1234
12345
 */
