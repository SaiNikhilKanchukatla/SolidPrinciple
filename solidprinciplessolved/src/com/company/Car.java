package com.company;

public class Car extends Vehicle implements Insurance{

    @Override
    public int calculateInsurance() {
        return 1000;
    }
}
