package com.company.recursion;

import java.util.Arrays;

public class Recursion_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,34,5,5556,1,45,33,5};
        int start = 0;
        selection(arr,start);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr,int start){
        if(start==arr.length){
            return;
        }
        int min = Integer.MAX_VALUE;
        for (int i=start;i<arr.length;i++){
            if(arr[i]<min){
                int temp = arr[i];
                arr[i] = min;
                min = temp;
            }
        }
        arr[start] = min;
        selection(arr,start+1);
    }
}
