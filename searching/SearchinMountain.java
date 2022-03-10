package com.company.searching;

public class SearchinMountain {
    public static void main(String[] args) {
        int[] arr = {2,23,455,56,23,10,5};
        int target = 23;
        int peak = peakinM(arr);
        int ans = BinaryAsc(arr,target,0,peak);
        if(ans==-1){
            ans = BinaryDec(arr,target,peak,arr.length-1);
        }
        System.out.println(ans);
    }
    static int peakinM(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
    static int BinaryAsc(int[] arr,int target,int first,int last){
        while(first<=last){
            int mid = first + (last-first)/2;
            if (target==arr[mid]){
                return mid;
            }if (target>arr[mid]){
                first = mid+1;
            }if (target<arr[mid]){
                last = mid-1;
            }
        }
        return -1;
    }
    static int BinaryDec(int[] arr,int target,int first,int last){
        while(first<=last){
            int mid = first + (last-first)/2;
            if (target==arr[mid]){
                return mid;
            }if (target>arr[mid]){
                last = mid-1;
            }if (target<arr[mid]){
                first = mid+1;
            }
        }
        return -1;
    }
}
