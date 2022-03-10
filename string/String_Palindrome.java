package com.company.string;

import java.util.Locale;

public class String_Palindrome {
    public static void main(String[] args) {
        String name = "abcjba";
        name = name.toLowerCase();
        int s = 0;
        int e = name.length()-1;
        while(s<=e){
            if(name.charAt(s)==name.charAt(e)){
                s++;
                e--;
            }else{
                System.out.println("Given String is not Palindrome");
                return;
            }
        }
        System.out.println("Given String is Palindrome");
    }
}
