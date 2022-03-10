package com.company.matrix;

import java.util.Arrays;

public class Matrix_SetZeroes {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(mat);
    }
    public static int[][] setZeroes(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix.length;k++){
                        ans[k][j]=0;
                    }
                    for(int l=0;l<matrix[0].length;l++){
                        ans[i][l]=0;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
        return ans;
    }
}
