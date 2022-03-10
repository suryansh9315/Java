package com.company.oops.Polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num){
        this.num = num;
    }
    @Override
    public String toString(){
        return "{ num : "+num+" }";
    }
    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(50);
        System.out.println(obj);
    }
}
