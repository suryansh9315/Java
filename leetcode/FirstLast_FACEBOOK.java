package com.company.leetcode;

import java.util.Arrays;

public class FirstLast_FACEBOOK {
    public static void main(String[] args) {
        int[] arr = {5,6,7,7,7,7,7,8,8,9};
        int target = 7;
        FirstLast(arr,target);
    }
    static void FirstLast(int[] arr,int target) {
        int[] ans = {-1,-1};
        ans[0] = Binary(arr,target,true);
        ans[1] = Binary(arr,target,false);
        System.out.println(Arrays.toString(ans));
    }
    static int Binary(int[] arr,int target,boolean value){
        int ans =-1;
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (target > arr[mid]) {
                first=mid+1;
            }
            else if (target < arr[mid]) {
                last=mid-1;
            }else{
                ans=mid;
                if(value){
                    last=mid-1;
                }else{
                    first=mid+1;
                }
            }
        }
        return ans;
    }
}