package com.company.recursion;

public class Recursion_Binarysearch {
    public static void main(String[] args) {
        int[] arr = {23,45,56,67,78,99};
        int target = 45;
        int first = 0;
        int last = arr.length-1;
        int ans = Binary(arr,target,first,last);
        System.out.println(ans);
    }
    static int Binary(int[] nums, int target,int first,int last){
        if(first<=last){
            int mid = first + (last-first)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                first = mid+1;
            }
            if(nums[mid]>target){
                last=mid-1;
            }
            return Binary(nums,target,first,last);
        }
        return -1;
    }
}
