package com.company.oops.Interfaces;

public class Car implements Brake,Engine{
    @Override
    public void brakes() {
        System.out.println("De-accelerating Mercedes");
    }

    @Override
    public void start() {
        System.out.println("Starting Mercedes");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Mercedes");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating Mercedes");
    }
}
