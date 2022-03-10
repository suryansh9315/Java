package com.company.oops.Interfaces;

public class BigCar implements Brake{

    private Engine engine;
    private Radio radio = new CDPlayer();

    public BigCar(){
        engine = new MainEngine();
    }
    public BigCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void start_music(){
        radio.start();
    }
    public void stop_music(){
        radio.stop();
    }
    public void upgrade_engine(Engine engine){
        this.engine = engine;
    }

    @Override
    public void brakes() {
        System.out.println("Big car Brakes");
    }
}
