package com.company.leetcode;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,20};
        int target = 6;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr , int target){
        int first=0;
        int last = arr.length-1;
        int ans=0;
        while(first<=last){
            int middle = (first+last)/2;
            if(arr[middle]>target){
                last=middle-1;
                ans=arr[first];
            }
            if(arr[middle]<target){
                first=middle+1;
                ans=arr[first];
            }
            if(arr[middle]==target){
                return arr[middle];
            }
        }
        return ans;
    }
}
