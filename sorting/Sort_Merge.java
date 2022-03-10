package com.company.sorting;

import java.util.Arrays;

public class Sort_Merge {
    public static void main(String[] args) {
        int[] arr = {23,3,455,1,7,8,3};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));   // creates a new array
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] ans = new int[first.length+ second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                ans[k]= first[i];
                i++;
            }else{
                ans[k] = second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            ans[k]=first[i];
            i++;
            k++;
        }while(j< second.length){
            ans[k]=second[j];
            j++;
            k++;
        }
        return ans;
    }
}

// Merge Sort is Stable
// Time Complexity O(N*log(N))
