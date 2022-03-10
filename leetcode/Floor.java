package com.company.leetcode;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,14,16,20};
        int target = 7;
        int ans=floor(arr,target);
        System.out.println(ans);
    }
    static int floor(int[] arr,int target){
        int first=0;
        int last = arr.length-1;
        int ans=0;
        while(first<=last){
            int middle = (first+last)/2;
            if(arr[middle]>target){
                last=middle-1;
                ans=arr[last];
            }
            if(arr[middle]<target){
                first=middle+1;
                ans=arr[last];
            }
            if(arr[middle]==target){
                return arr[middle];
            }
        }
        return ans;
    }
}
