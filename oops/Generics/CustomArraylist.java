package com.company.oops.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {

    private int[] arr;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArraylist() {
        arr = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        arr[size++] = num;
    }

    public int get(int index){
        return arr[index];
    }

    public int length(){
        return size;
    }

    public void set(int index,int new_value){
        arr[index] = new_value;
    }

    private void resize() {
        int[] temp = new int[arr.length * 2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    private boolean isFull() {
        return arr.length == size;
    }

    @Override
    public String toString() {
        return "data : "+ Arrays.toString(arr)+" Size : "+size;
    }

    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        System.out.println(list);
    }
}
