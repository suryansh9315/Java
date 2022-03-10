package com.company.matrix;

import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Rows of First Matrix : ");
        int row = input.nextInt();
        System.out.print("Enter Number of Columns of First Matrix : ");
        int col = input.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter Values of First Matrix");
        for (int i = 0; i < row; i++) {
            System.out.print("Enter " + (i + 1) + " Row :");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter Number of Rows of Second Matrix : ");
        int row2 = input.nextInt();
        System.out.print("Enter Number of Columns of Second Matrix : ");
        int col2 = input.nextInt();
        int[][] matrix2 = new int[row2][col2];
        System.out.println("Enter Values of Second Matrix");
        for (int i = 0; i < row2; i++) {
            System.out.print("Enter " + (i + 1) + " Row :");
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        int sum;
        int[][] multiply = new int[row][col2];
        for (int i=0;i<row;i++){
            for (int j=0;j<col2;j++){
                sum=0;
                for (int z=0;z<col;z++){
                    sum+=matrix[i][z]*matrix2[z][j];
                }
                multiply[i][j]=sum;
            }

        }
        for (int i=0;i<row;i++){
            System.out.println(" ");
            for (int j=0;j<col2;j++){
                System.out.print(multiply[i][j]+" ");
            }
        }
    }
}
