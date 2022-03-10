package com.company.subset;

public class Subsets_permu {
    public static void main(String[] args) {
        String a = "abc";
        permu("",a);
    }
    static void permu(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for (int i=0;i<p.length()+1;i++){
            permu(p.substring(0,i)+up.substring(0,1)+p.substring(i),up.substring(1));
        }
    }
}
