package com.company.recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recursion_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23,45,2,3,778,3,90};
        bubble(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr,int start,int end){
        if(end==0){
            return;
        }
        if(start==end){
            bubble(arr,0,end-1);
        }
        else{
            if(arr[start]>arr[start+1]){
                int temp = arr[start+1];
                arr[start+1] = arr[start];
                arr[start] = temp;
            }
            bubble(arr,start+1,end);
        }
    }
}
