package com.company.bit;

import java.util.Scanner;

public class Bit_OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ((n & 1) ==1){
            System.out.println("Given Number is Odd");
        }else{
            System.out.println("Given Number is Even");
        }
    }
}
