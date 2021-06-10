package com.company;

public class Insurance {
    public int calculateInsurance(Vehicle vehicle){
        if(vehicle instanceof Car) return 1000;
        else if(vehicle instanceof RacingCar) return 2000;
        return 0;
    }
}
