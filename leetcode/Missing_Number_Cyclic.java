package com.company.leetcode;

public class Missing_Number_Cyclic {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missing(arr));
    }
    static int missing(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i]>=arr.length){
                i++;
            }
            else if(arr[i]==arr[arr[i]]){
                i++;
            }
            else{
                int temp = arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=temp;
            }
        }
        // Find the Missing Number
        for(int j=0;j<arr.length;j++){
            if(j != arr[j]){
                return j;
            }
        }
        return arr.length;
    }
}
