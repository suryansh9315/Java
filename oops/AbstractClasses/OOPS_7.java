package com.company.oops.AbstractClasses;

public class OOPS_7 {
    public static void main(String[] args) {
        Son surya = new Son(30);
        surya.Carrier();
        surya.Partner();

        Daughter suri = new Daughter(30);
        suri.Carrier();
        suri.Partner();

//        Parent pap = new Parent(30);  Cannot create Objects of abstract classes
    }
}

// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/lectures/17-oop/notes/abstract.txt
