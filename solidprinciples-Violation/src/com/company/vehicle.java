package com.company;

class Vehicle extends Engine implements Operations{
    @Override
    public void accelerate() {
        System.out.println("Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Applying brakes");
    }

    Engine engine = new Engine();

    void startEngine(){
        engine.startEngine();
    }

    void stopEngine(){
        engine.stopEngine();
    }
}
