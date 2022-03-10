package com.company.oops.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human A = new Human(19,"Suryansh");
        Human B = new Human(A);

        System.out.println(Arrays.toString(A.arr));
        System.out.println(Arrays.toString(B.arr));

        B.arr[0] = 0;

        System.out.println(Arrays.toString(A.arr));
        System.out.println(Arrays.toString(B.arr));

        A.arr[1] = 0;

        System.out.println(Arrays.toString(A.arr));
        System.out.println(Arrays.toString(B.arr));

        Human C = (Human)A.clone();

        System.out.println(C.age + " " + C.name);
        System.out.println(Arrays.toString(A.arr));
        System.out.println(Arrays.toString(C.arr));

        C.arr[0] = 0;

        System.out.println(Arrays.toString(A.arr));
        System.out.println(Arrays.toString(C.arr));

        A.arr[1] = 0;

        System.out.println(Arrays.toString(A.arr));
        System.out.println(Arrays.toString(C.arr));
    }
}
