package com.company.oops;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        OOPS_5 A = new OOPS_5(10,"Surya");
        System.out.println(A.num);
//        System.out.println(A.name);  Cannot Acceess Private variables
        System.out.println(Arrays.toString(A.arr));

        System.out.println(A.getName());
        A.setName("Jodd");
        System.out.println(A.getName());
    }
}



