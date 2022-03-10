package com.company;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String name = "suryansh";
        StringBuilder ans = new StringBuilder();
        int i = 0;
        String ans2 = Removea(name,ans,i);
        System.out.println(ans2);
    }
    static String Removea(String a,StringBuilder b,int c){
        if(c==a.length()){
            return b.toString();
        }
        if(a.charAt(c)!='a'){
            b.append(a.charAt(c));
        }
        return Removea(a,b,c+1);
    }
}

