package com.company.searching;

public class SearchinRotated {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 0;
        if(arr.length==1){
            if(target==arr[0]){
                System.out.println(0);
                return;
            }else{
                System.out.println(-1);
                return;
            }
        }
        if(arr[0]<arr[arr.length-1]){
            System.out.println(BinaryAsc(arr,target,0, arr.length-1));
            return;
        }
        int peak = Rota(arr);
        if(peak==target){
            System.out.println(arr[peak]);
            return;
        }
        int ans = BinaryAsc(arr,target,0,peak);
        if(ans==-1){
            ans = BinaryAsc(arr,target,peak+1,arr.length-1);
        }
        System.out.println(ans);
    }
    static int Rota(int[] arr){
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
            int mid = (first+last)/2;
            if(mid<last && arr[mid]>arr[mid+1]) {
                return mid;
            }
            if(mid>first && arr[mid]<arr[mid-1]) {
                return (mid-1);
            }
            if(arr[mid]<arr[mid+1]){
                if(arr[first]>arr[mid]){
                    last=mid-1;
                }
                if(arr[first]<arr[mid]){
                    first=mid+1;
                }
            }
        }
        return -1;
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
}
