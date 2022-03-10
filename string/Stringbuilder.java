package com.company.string;
// Printing all alphabets
public class Stringbuilder {
    public static void main(String[] args) {
//        alpha1();
        alpha2();
    }
    static void alpha1(){
        String ans = "";
        for (int i=0;i<26;i++){
            char ch = (char)('a'+i);
            ans+=ch;
        }
        System.out.println(ans);
    }
    static void alpha2(){
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<26;i++){
            char ch = (char)('a'+i);
            ans.append(ch);
        }

        System.out.println(ans.toString());
    }
}
//  Aplha1 Method take too much storage
