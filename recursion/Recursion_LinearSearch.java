package com.company.recursion;

public class Recursion_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,55,55,1,4,667,88999};
        int target = 55;
        int i = 0;
        System.out.println(linear(arr,target,i));
    }
    public static boolean linear(int[] arr,int target,int start){
        if(start==arr.length){
            return false;
        }
        if (arr[start] == target) {
            return true;
        }
        return linear(arr,target,start+1);
    }
}
