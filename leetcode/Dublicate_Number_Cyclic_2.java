package com.company.leetcode;

public class Dublicate_Number_Cyclic_2 {
    public static void main(String[] args) {
        int[] arr = {2,2};
        missing(arr);
    }
    static void missing(int[] arr){
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
        for(int j=0;j<arr.length;j++){
            if(j+1!=arr[j]){
                System.out.println(arr[j]);
            }
        }
    }
}

