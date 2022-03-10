package com.company.string;

import java.util.Scanner;

public class Stringreverse {
    public static void reverse(String string){
        int len = string.length();
        StringBuilder reve = new StringBuilder(len);
        for (int i = len-1;i>=0;i--){
            reve.append(string.charAt(i));
        }
        System.out.println(reve);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        reverse(name);
//        String reve = new StringBuffer(name).reverse().toString();
//        System.out.println(reve);
    }
}
