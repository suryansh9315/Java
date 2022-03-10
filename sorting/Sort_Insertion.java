package com.company.sorting;

import java.util.Arrays;

public class Sort_Insertion {
    public static void main(String[] args) {
        int[] arr = {23,4,4,5,6};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }
}
//   Insertion sort is stable.
//   Worst cans Average Case Time Complexity = O(n*n)
//   Best case Time Complexity = O(n*n)
//   Auxillary Space = O(1)
