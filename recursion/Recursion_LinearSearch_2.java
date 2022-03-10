package com.company.recursion;

import java.util.ArrayList;

public class Recursion_LinearSearch_2 {
    public static void main(String[] args) {
        int[] arr = {2,3,55,55,1,4,55,88999};
        int target = 55;
        int i = 0;
        System.out.println(linear(arr,target,i));
    }
    public static ArrayList<Integer> linear(int[] arr,int target,int start){
        ArrayList<Integer> list = new ArrayList<>();
        if(start==arr.length){
            return list;
        }
        if(arr[start]==target){
            list.add(start);
        }
        list.addAll(linear(arr,target,start+1));
        return list;
    }
}
