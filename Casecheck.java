package com.company;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Casecheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c = input.next();
        char a = c.charAt(0);
        System.out.println(a);
        System.out.println("ASCII Value : " + (int)(a));
        if (a>='A'&&a<='Z'){
            System.out.println("Uppercase");
        }
        if (a>='a'&&a<='z'){
            System.out.println("Lowercase");
        }

    }
}
