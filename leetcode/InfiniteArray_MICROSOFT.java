package com.company.leetcode;

public class InfiniteArray_MICROSOFT {
    public static void main(String[] args) {
        int[] ans = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int target = 16;
        System.out.println(Search(ans,target));
    }
    static int Search(int[] arr,int target){
        int first = 0;
        int last = 1;
        while(first<=last){
            int mid = (first+last)/2;
            if(target>arr[last]){
                int news = last+1;
                last = last+(last-first+1)*2;
                first=news;
            }else if (target==arr[last]){
                return last;
            }else{
                if(target>arr[mid]){
                    first=mid+1;
                }else if(target<arr[mid]){
                    last=mid-1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
