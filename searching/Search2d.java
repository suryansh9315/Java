package com.company.searching;

public class Search2d {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,},{56,78,99,2},{34,89}};
        int target = 9;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (target==arr[i][j]){
                    System.out.println("Target is present at index "+j+" of "+(i+1)+" row");
                    return;
                }
            }
        }
        System.out.println("Target Not Present");
    }
}
