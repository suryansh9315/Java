package com.company.matrix;

import java.util.Arrays;

// Matrix is row sorted and coloum sorted
public class Matrix_2d_search {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},
                       {15,25,35,45},
                       {17,27,37,47}};
        int target = 35;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        int r = 0;
        int c = arr[0].length-1;
        while(r < arr.length && c >=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
