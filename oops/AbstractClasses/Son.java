package com.company.oops.AbstractClasses;

public class Son extends Parent{

    public Son(int num) {
        super(num);
    }

    @Override
    void Carrier() {
        System.out.println("Docter");
    }

    @Override
    void Partner() {
        System.out.println("Alexander Daddario");
    }
}
