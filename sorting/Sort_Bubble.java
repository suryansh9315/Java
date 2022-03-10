package com.company.sorting;

import java.util.Arrays;

public class Sort_Bubble {
    public static void main(String[] args) {
        int[] arr = {2,45,-34,-5,0,344,7,5555};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr){
        boolean run;
        for(int i=0;i<arr.length;i++){
            run = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp =  arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    run = true;
                }
            }
            if(!run){
                break;
            }
        }
    }
}

//   Bubble sort is stable.
//   Worst cans Average Case Time Complexity = O(n*n)
//   Best case Time Complexity = O(n)
//   Auxillary Space = O(1)
