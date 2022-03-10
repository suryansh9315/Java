package com.company.oops.Inheritance;

import com.company.oops.Inheritance.Box;

public class Box_Inheritance extends Box {
    int weight;

    Box_Inheritance(){
//        super(); // No need to call .It is called by default
        this.weight = 20;
    }
    Box_Inheritance(int l,int b,int h,int w){
        super(l,b,h);  // Calls Parent Class Constructor
        this.weight = w;
    }
}

