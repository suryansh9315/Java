package com.company.leetcode;

public class PeakinMountain {
    public static void main(String[] args) {
        int[] arr = {3,33,455,6778,700,88,30,2};
        for(int i=0;i<arr.length;i++){
            int a = 0;
            int b = 0;
            for(int j=i;j>0;j--){
                if (arr[j] < arr[j - 1]) {
                    a=1;
                    break;
                }
            }
            for(int k=i;k<arr.length-1;k++){
                if (arr[k] < arr[k + 1]) {
                    b=1;
                    break;
                }
            }
            if (a==0 && b==0){
                System.out.println(i);
            }
        }
    }
}
