package com.company.string;

import java.util.Scanner;

public class Stringsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String : ");
        String name = in.nextLine();
        System.out.print("Enter char to be Searched : ");
        char search = in.next().charAt(0);
        for (int i=0;i<name.length();i++){
            if (search==name.charAt(i)){
                System.out.println("char at index "+i);
                return;
            }
        }
        System.out.println("Char is not Present in the given String");
    }
}
