package com.company.oops.AbstractClasses;

public class Daughter extends Parent {

    public Daughter(int num) {
        super(num);
    }

    @Override
    void Carrier() {
        System.out.println("Enginneaur");
    }

    @Override
    void Partner() {
        System.out.println("Tom Hardy");
    }
}
