package com.company;

import java.util.Scanner;

public class Largestinarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length of Array : ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i] = input.nextInt();
        }
        int max = array[0];
        for (int i=1;i<n;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        System.out.println("Max : "+max);
    }
}
