package com.company;

public class Casting {
    public static void main(String[] args) {
        // Type-Casting
        int marks = (int)(66.55f);
        System.out.println(marks);

        // Automatic Type Promotion in Expressions
        int a = 257;
        byte b = (byte)(a);  // 257 % 256 = 1
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c*d/e;
        System.out.println(f);

        int number = 'A';
        System.out.println(number);     // ASCII Value

        byte z = 34;
        char y = 'd';
        short x = 3340;
        int w = 20000;
        float v = 45.5f;
        double u = 45665.6667;
        double t = (z-y)+(u/x)+(w/v);
        System.out.println((z-y)+" "+(u/x)+" "+(w/v));
        System.out.println(t);
    }
}
