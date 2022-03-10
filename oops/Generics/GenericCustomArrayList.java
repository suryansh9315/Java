package com.company.oops.Generics;

import java.util.Arrays;

public class GenericCustomArrayList<T> {
    private Object[] arr;
    private static int DEFAULT_SIZE = 5;
    private int size = 0;

    public GenericCustomArrayList() {
        arr = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        arr[size++] = num;
    }

    public T get(int index) {
        return (T)(arr[index]);
    }

    public int length() {
        return size;
    }

    public void set(int index, T new_value) {
        arr[index] = new_value;
    }

    private void resize() {
        Object[] temp = new Object[arr.length * 2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    private boolean isFull() {
        return arr.length == size;
    }

    @Override
    public String toString() {
        return "data : " + Arrays.toString(arr) + " Size : " + size;
    }

    public static void main(String[] args) {
        GenericCustomArrayList<Integer> list2 = new GenericCustomArrayList<>();
        list2.add(34);
        list2.add(34);
        list2.add(34);
        list2.add(34);
        list2.add(34);
        list2.add(34);
//        list2.add("ghujgj");
        System.out.println(list2);
    }
}
