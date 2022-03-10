package com.company.string;

public class Pangram {
    public static void main(String[] args) {
        String sent = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(checkIfPangram(sent));
    }
    public static boolean checkIfPangram(String sentence) {
        int num=0;
        for(int i=97;i<123;i++){
            for(int j=0;j<sentence.length();j++){
                if(sentence.charAt(j)==i){
                    num++;
                    break;
                }
            }
        }
        System.out.println(num);
        return num == 26;
    }
}
