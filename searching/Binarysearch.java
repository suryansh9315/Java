package com.company.searching;

import java.util.Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {23,45,6,778,8,33345,4567,454};
        int[] arr2 = {45444,5556,444,56,7,5,2};
        int target = 454;
        int target2 = 55;
        BinaryDec(arr2,target2);
        System.out.println(Arrays.toString(Sort(arr)));
        BinaryAsc(Sort(arr),target);
    }
    static void BinaryAsc(int[] arr,int target){
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
//            int mid = (first+last)/2;  // Might Exceed Integer limit
            int mid = first + (last-first)/2;
            if (target==arr[mid]){
                System.out.println("Target at Index "+mid);
                return;
            }if (target>arr[mid]){
                first = mid+1;
            }if (target<arr[mid]){
                last = mid-1;
            }
        }
        System.out.println("Target D.N.E");
    }
    static void BinaryDec(int[] arr,int target){
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
//            int mid = (first+last)/2;  // Might Exceed Integer limit
            int mid = first + (last-first)/2;
            if (target==arr[mid]){
                System.out.println("Target at Index "+mid);
                return;
            }if (target>arr[mid]){
                last = mid-1;
            }if (target<arr[mid]){
                first = mid+1;
            }
        }
        System.out.println("Target D.N.E");
    }
    static int[] Sort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int min=Integer.MAX_VALUE;
            for (int j=i;j<arr.length;j++){
                if (min>arr[j]){
                    int temp =arr[j];
                    arr[j]=min;
                    min=temp;
                }
            }
            arr[i]=min;
        }
        return arr;
    }
}
