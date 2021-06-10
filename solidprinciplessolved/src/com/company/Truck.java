package com.company;

public class Truck extends Vehicle implements Accelerate,Brake,Insurance{

    @Override
    public int calculateInsurance() {
        return 1500;
    }
}
