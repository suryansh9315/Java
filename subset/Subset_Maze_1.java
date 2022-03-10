package com.company.subset;

import java.util.ArrayList;

public class Subset_Maze_1 {
    public static void main(String[] args) {
//        path("",3,3);
//        System.out.println(count(3,3));
//        System.out.println(pathlist("",3,3));
//        System.out.println(countdiagonal(3,3));
//        pathdiagonal("",3,3);
        System.out.println(pathlistdiagonal("",3,3));
    }
    static int count(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        int left = count(row-1,col);
        int right = count(row,col-1);
        return left+right;
    }
    static int countdiagonal(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        int left = countdiagonal(row-1,col);
        int right = countdiagonal(row,col-1);
        int dia = countdiagonal(row-1,col-1);
        return left+right+dia;
    }
    static void path(String up,int row,int col){
        if(row==1 && col==1){
            System.out.println(up);
            return;
        }
        if(col>1){
            path(up+"R",row,col-1);
        }
        if(row>1){
            path(up+"D",row-1,col);
        }
    }
    static void pathdiagonal(String up,int row,int col){
        if(row==1 && col==1){
            System.out.println(up);
            return;
        }
        if(row>1 && col>1){
            pathdiagonal(up+"D",row-1,col-1);
        }
        if(col>1){
            pathdiagonal(up+"H",row,col-1);
        }
        if(row>1){
            pathdiagonal(up+"V",row-1,col);
        }
    }
    static ArrayList<String> pathlist(String up, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(col>1){
            list.addAll(pathlist(up+"R",row,col-1));
        }
        if(row>1){
            list.addAll(pathlist(up+"D",row-1,col));
        }
        return list;
    }
    static ArrayList<String> pathlistdiagonal(String up, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row>1 && col>1){
            list.addAll(pathlistdiagonal(up+"D",row-1,col-1));
        }
        if(col>1){
            list.addAll(pathlistdiagonal(up+"H",row,col-1));
        }
        if(row>1){
            list.addAll(pathlistdiagonal(up+"V",row-1,col));
        }
        return list;
    }
}
