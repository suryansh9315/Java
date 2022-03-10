package com.company.oops.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<5;i++){
            list.add(i+2);
        }
        list.forEach(item -> System.out.println(item *2));

        Consumer<Integer> jodd = item -> System.out.println(item *2);
        list.forEach(jodd);

        Operation sum = (a,b) -> a+b;
        System.out.println(sum.sum3(20,20));
    }
    int sum2(int a,int b){
        return a+b;
    }
}
interface Operation{
    int sum3(int a,int b);
}
