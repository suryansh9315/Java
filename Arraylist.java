package com.company;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(0);
        list.add(888);
        list.add(9999);
        list.add(6777);
        list.add(233);
        list.add(344);
        list.add(677);
        list.add(566);
        list.add(34894829);
        list.add(1);
        list.add(12);
        list.add(23);
        list.add(343);
        list.add(3444);
//        System.out.println(list.size());
        System.out.println(list.contains(12));
        System.out.println(list);
        list.set(0,99);     // (index,number)
        list.set(3,0);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(2));
        //Input
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        //Output
        for (int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);

        ArrayList<ArrayList<Integer>> roll = new ArrayList<>(3);
        //Initialization
//        for (int i=0;i<3;i++){
//            list.add(new ArrayList<>());
//        }
//        //Adding Elements
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                list.get(i).add(in.nextInt());
//            }
//        }

    }
}
