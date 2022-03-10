package com.company.matrix;

public class Matrix_CountNegative {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
//        int[][] grid2 = {{7,-3}};
        int ans = countNegatives((grid));
        System.out.println(ans);
    }
    public static int countNegatives(int[][] grid) {
        int rowbeg = 0;
        int colend = grid[0].length-1;
        int ans = 0;
        while(rowbeg<grid.length  &&  colend>=0){
            for(int i=rowbeg;i<grid.length;i++){
                for(int j=colend;j>=0;j--){
                    if(grid[i][j]<0){
                        colend--;
                        for(int z=0;z<grid.length-rowbeg;z++){
                            ans++;
                        }
                    }else{
                        rowbeg++;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
