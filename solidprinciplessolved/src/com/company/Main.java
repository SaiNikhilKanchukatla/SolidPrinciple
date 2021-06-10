package com.company;

public class Main {

    public static void main(String[] args) {
        Car benz = new Car();
        Fuel fuel =new Fuel();
        VehicleService vehicleService = new VehicleService();
        RacingCar ferrari = new RacingCar();
        Bicycle bicycle = new Bicycle();
        Truck truck = new Truck();


        //Single Responsibility
        fuel.checkFuel();
        fuel.fillFuel();
        vehicleService.waterServicing();
        vehicleService.dentRepairing();

        //Open closed
        System.out.println(benz.calculateInsurance());
        System.out.println(ferrari.calculateInsurance());
        System.out.println(truck.calculateInsurance());

        //Liskov Substitution
        bicycle.startMoving();
        benz.startEngine();

        //interface segregation
        benz.accelerate();
        benz.applyBrake();

        //dependency Inversion
        benz.startEngine();
        benz.stopEngine();

    }
}
