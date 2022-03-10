package com.company.subset;

import java.util.ArrayList;

public class Subsets {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String a = "abc";
        String b = "";
        sub(a,b);
        System.out.println(list);
    }
    static void sub(String up,String p){
        if(up.isEmpty()){
//            System.out.println(p);
            list.add(p);
            return;
        }
        char ch = up.charAt(0);

        sub(up.substring(1),p+ch);
        sub(up.substring(1),p);
    }
}
// Permutation & Combination
// Subsets -> non-adjacent collection
// Pattern of taking some elements and removing some is subset pattern

