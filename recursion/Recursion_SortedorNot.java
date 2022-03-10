package com.company.recursion;

public class Recursion_SortedorNot {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,9};
        int i = 0;
        System.out.println(sorted(arr,i));
    }
    public static boolean sorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
//        if(arr[i]>arr[i+1]){
//            return false;
//        }
        return !(arr[i]>arr[i+1]) && sorted(arr,i+1);
    }
}
