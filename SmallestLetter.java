package com.company;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] name = {'d','g','j','t','x','y'};
        char target = 'x';
        char ans = Smallest(name,target);
        System.out.println(ans);
    }
    static char Smallest(char[] arr,char target){
        int first = 0;
        int last = arr.length-1;
        char ans = 'a';
        if(target>=arr[arr.length-1]){
            return arr[0];
        }
        while(first<=last){
            int mid = (first+last)/2;
            if(arr[mid]>target){
                last=mid-1;
                ans = arr[first];
            }
            if(arr[mid]<=target){
                first=mid+1;
                ans = arr[first];
            }
        }
        return ans;
    }
}
