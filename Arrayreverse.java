package com.company;

import java.util.Arrays;

public class Arrayreverse {
    public static void main(String[] args) {
        int[] roll = {2,34,56,67,3};
        reverse(roll);
        System.out.println(Arrays.toString(roll));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] array,int num1,int num2){
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }
}

