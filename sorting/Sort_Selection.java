package com.company.sorting;

import java.util.Arrays;

public class Sort_Selection {
    public static void main(String[] args) {
        int[] arr = {2,-55,0,6,677,-45};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    int temp=arr[j];
                    arr[j]=min;
                    min=temp;
                }
            }
            arr[i]=min;
        }
    }
}
//   Selection sort is not stable.
//   Worst cans Average Case Time Complexity = O(n*n)
//   Best case Time Complexity = O(n*n)
//   Auxillary Space = O(1)
