package com.company.oops.Collections;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(45);
        System.out.println(vector);

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(32425);
        vector2.add(324);
        vector2.add(425);
        vector2.add(3);
        System.out.println(vector2);
    }
}

// ArrayList is Not Synchronized -> Multiple threads can Access same Object
// Vector is Synchronized -> Multiple threads cannot Access same Object
