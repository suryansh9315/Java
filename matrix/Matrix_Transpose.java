package com.company.matrix;

import java.util.Arrays;

public class Matrix_Transpose {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
        for (int i=0;i<3;i++){
            for(int j=i;j<3;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<3;i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
