package com.company;

import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m=2;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        int start = max;
        int end = sum;
        while(start<end){
            int mid = (start+end)/2;
            int sum2=0;
            int count=1;
            for(int i=0;i<arr.length;i++){
                if(sum2+arr[i]>mid){
                    sum2=arr[i];
                    count++;
                }else{
                    sum2+=arr[i];
                }
            }
            if(count>m){
                start = mid+1;
            }else{
                end=mid;
            }
        }
        System.out.println(start);        // Start==End
    }
}
