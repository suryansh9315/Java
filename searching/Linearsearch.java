package com.company.searching;

import java.util.Scanner;
import java.util.Arrays;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Terms of the Array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter Element to be Searched:");
        int item = in.nextInt();
        for (int i=0;i<n;i++){
            if (item==arr[i]){
                System.out.println("Element is at Index "+i);
                return;
            }
            }
        System.out.println("Element is not Present");
    }
}

