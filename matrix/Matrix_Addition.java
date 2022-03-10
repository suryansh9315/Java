package com.company.matrix;

import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int row = input.nextInt();
        System.out.print("Enter Number of Columns : ");
        int col = input.nextInt();
        int[][] matrix= new int[row][col];
        System.out.println("Enter Values of First Matrix");
        for (int i=0;i<row;i++) {
            System.out.print("Enter "+(i+1)+" Row :" );
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[][] matrix2= new int[row][col];
        System.out.println("Enter Values of Second Matrix");
        for (int i=0;i<row;i++) {
            System.out.print("Enter "+(i+1)+" Row :" );
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
//        System.out.print("First Matrix :");
//        for (int i=0;i<row;i++){
//            System.out.println("");
//            for (int j=0;j<col;j++){
//                System.out.print(matrix[i][j]);
//            }
//        }
//        System.out.print("Second Matrix :");
//        for (int i=0;i<row;i++){
//            System.out.println("");
//            for (int j=0;j<col;j++){
//                System.out.print(matrix2[i][j]);
//            }
//        }
        int[][] sum = new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                sum[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
        System.out.print("Resultant Matrix :");
        for (int i=0;i<row;i++){
            System.out.println("");
            for (int j=0;j<col;j++){
                System.out.print(sum[i][j]+"  ");
            }
        }
    }
}
