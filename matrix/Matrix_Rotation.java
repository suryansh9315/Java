package com.company.matrix;

import java.util.Arrays;

public class Matrix_Rotation {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target ={{1,1,1},{0,1,0},{0,0,0}};
//      System.out.println(Arrays.toString(rotate(mat)));
//        for(int i=0;i<mat.length;i++){
//            System.out.println(Arrays.toString(rotate(mat)[i]));
//        }
        mat = rotate(mat);
        for (int[] ints : mat) {
            System.out.println(Arrays.toString(ints));
        }
        mat = rotate(mat);
        for (int[] ints : mat) {
            System.out.println(Arrays.toString(ints));
        }
        mat = rotate(mat);
        for (int[] ints : mat) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] rotate(int[][] matrix){
        int[][] rot = new int[matrix.length][matrix[0].length];
        for(int j=0;j<matrix.length;j++){
            for(int k=0;k<matrix[j].length;k++){
                rot[k][matrix.length-j-1]=matrix[j][k];
            }
        }
        return rot;
    }
}
