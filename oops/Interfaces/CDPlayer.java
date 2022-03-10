package com.company.oops.Interfaces;

public class CDPlayer implements Radio{
    @Override
    public void start() {
        System.out.println("Radio Start");
    }

    @Override
    public void stop() {
        System.out.println("Radio Stops");
    }
}
