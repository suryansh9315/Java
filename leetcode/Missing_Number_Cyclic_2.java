package com.company.leetcode;

import java.util.Arrays;

public class Missing_Number_Cyclic_2 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        missing(arr);
    }
    static void missing(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i] != arr[arr[i]-1]){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(j>arr[j]){     // or   j+1! = arr[j]
                System.out.println(j+1);
            }
        }
    }
}
