package com.company;

public class Vehicle implements Accelerate,Brake,Engine{

    @Override
    public void accelerate() {
        System.out.println("Accelerating");
    }

    @Override
    public void applyBrake() {
        System.out.println("Braking");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine Stopped");
    }
}
