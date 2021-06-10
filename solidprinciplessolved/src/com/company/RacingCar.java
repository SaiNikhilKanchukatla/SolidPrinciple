package com.company;

public class RacingCar extends Vehicle implements Insurance{


    @Override
    public int calculateInsurance() {
        return 2000;
    }
}
