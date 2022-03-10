package com.company.oops.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.acc();
        car1.brakes();
        car1.start();
        car1.stop();

        System.out.println(Engine.price);
        System.out.println(car1.price);

        BigCar car2 = new BigCar();
        car2.start();
        car2.stop();
        car2.acc();
        car2.start_music();
        car2.stop_music();
        car2.brakes();
        car2.upgrade_engine(new ElectricEngine());
        car2.start();
    }
}
