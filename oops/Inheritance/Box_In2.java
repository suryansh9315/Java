package com.company.oops.Inheritance;

public class Box_In2 extends Box_Inheritance {
    int gravity;
    Box_In2(){
//        super(); // No need to call .It is called by default
        this.gravity = 10;
    }

    Box_In2(int l,int b,int h,int w){
        super(l,b,h,w);
        this.gravity = 10;
    }
}
