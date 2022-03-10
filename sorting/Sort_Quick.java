package com.company.sorting;

import java.util.Arrays;

public class Sort_Quick {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] arr,int l,int h){
        if(l<h){
            int i = l;
            int j = h;
            int pivot = arr[(i+j)/2];
            while(i<=j){
                while(arr[i]<pivot) i++;
                while(arr[j]>pivot) j--;
                if (i<=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            quick(arr,l,j);
            quick(arr,i,h);
        }
    }
}
// Pivot :  Choose any element After 1 pass
//          -> all elements less than pivot wil be at LHS of pivot
//          -> all elements greater than pivot wil be at RHS of pivot

// Recourrence Relation  T(N) = T(K) + T(N-K-1) + O(N)
// Worst Case Complexity  O(N^2)
// Best Case Complexity   O(NlogN)
// Quick Sort is Not Stable


// Tin Sort -->  Merge Sort + Insertion Sort

