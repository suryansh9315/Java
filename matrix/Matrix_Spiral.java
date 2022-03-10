package com.company.matrix;

import java.util.ArrayList;
import java.util.List;

public class Matrix_Spiral {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] mat2 = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(mat);
        spiralOrder(mat2);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int rowbeg = 0;
        int rowend = matrix.length-1;
        int colbeg = 0;
        int colend = matrix[0].length-1;
        int size = matrix.length*matrix[0].length;
        while(rowbeg<=rowend && colbeg<=colend && ans.size()<size){
            for(int i=colbeg;i<=colend && ans.size()<size;i++){
                ans.add(matrix[rowbeg][i]);
            }
            rowbeg++;
            for(int i=rowbeg;i<=rowend && ans.size()<size;i++){
                ans.add(matrix[i][colend]);
            }
            colend--;
            for(int i=colend;i>=colbeg && ans.size()<size;i--){
                ans.add(matrix[rowend][i]);
            }
            rowend--;
            for(int i=rowend;i>=rowbeg && ans.size()<size;i--){
                ans.add(matrix[i][colbeg]);
            }
            colbeg++;
        }
        System.out.println(ans);
        return ans;
    }
}
