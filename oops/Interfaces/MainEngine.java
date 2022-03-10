package com.company.oops.Interfaces;

public class MainEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Main Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Main Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Main Engine Accelerate");
    }
}
