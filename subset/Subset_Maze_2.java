package com.company.subset;

import java.util.Arrays;

public class Subset_Maze_2 {
    public static void main(String[] args) {
        boolean[][] value = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] maze = new int[value.length][value[0].length];
//        path("",value,0,0);
        path2("",value,0,0,maze,1);
    }
    static void path(String up,boolean[][] value,int row,int col){
        if(row== value.length-1 && col==value[0].length-1){
            System.out.println(up);
            return;
        }
        if(!value[row][col]){
            return;
        }
        value[row][col]=false;
        if(col<value[0].length-1){
            path(up+"R",value,row,col+1);
        }
        if(row<value.length-1){
            path(up+"D",value,row+1,col);
        }
        if(row>0){
            path(up+"U",value,row-1,col);
        }
        if(col>0){
            path(up+"L",value,row,col-1);
        }
        value[row][col]=true;
    }
    static void path2(String up,boolean[][] value,int row,int col,int[][] maze,int step){
        if(row== value.length-1 && col==value[0].length-1){
            maze[row][col]=step;
            for (int[] arr:maze){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            System.out.println(up);
            return;
        }
        if(!value[row][col]){
            return;
        }
        value[row][col]=false;
        maze[row][col]=step;
        if(col<value[0].length-1){
            path2(up+"R",value,row,col+1,maze,step+1);
        }
        if(row<value.length-1){
            path2(up+"D",value,row+1,col,maze,step+1);
        }
        if(row>0){
            path2(up+"U",value,row-1,col,maze,step+1);
        }
        if(col>0){
            path2(up+"L",value,row,col-1,maze,step+1);
        }
        value[row][col]=true;
        maze[row][col]=0;
    }
}
