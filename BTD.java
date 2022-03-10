package com.company;

import java.util.Scanner;

public class BTD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int binary = input.nextInt();
        double sum = 0;
        int rem;
        double base = 0;
        while(binary>0){
            rem = binary%10;
            sum = sum + rem*Math.pow(2,base);
            binary=binary/10;
            base++;
        }
        System.out.println("The Decimal Number is "+sum);
    }
}
