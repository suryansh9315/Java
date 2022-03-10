package com.company.leetcode;

public class Dublicate_Number_Cyclic {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(dub(arr));
    }
    static int dub(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i] != (i+1)){
                if(arr[i] != arr[arr[i]-1]){
                    int temp = arr[arr[i]-1];
                    arr[arr[i]-1]=arr[i];
                    arr[i]=temp;
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
}
