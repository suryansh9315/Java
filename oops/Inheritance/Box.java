package com.company.oops.Inheritance;

public class Box {
    private int l;
    int b;
    int h;
    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }
    Box(int side){
        this.l = side;
        this.b = side;
        this.h = side;
    }
    Box(int l,int h,int b){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }
}
