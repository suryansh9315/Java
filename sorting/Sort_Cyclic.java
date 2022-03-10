package com.company.sorting;

import java.util.Arrays;

public class Sort_Cyclic {
    public static void main(String[] args) {
        int[] arr = {6,3,2,4,1,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
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
    }
}
// When a question has range 1 to N ---- Use Cyclic Sort
