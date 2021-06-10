package com.company;

public class Main {

    public static void main(String[] args) {
         Car Benz = new Car();
        Engine engine = new Engine();

       //car
         Benz.accelerate();
         Benz.brake();
         Insurance insurance = new Insurance();
        System.out.println(insurance.calculateInsurance(Benz));

       //Racing car
        System.out.println("Racing Car");
        RacingCar Ferrari = new RacingCar();
        System.out.println(insurance.calculateInsurance(Ferrari));

        //service
        Benz.waterService();
        Benz.dentRepair();

       //Engine
        Benz.startEngine();
        Benz.stopEngine();

    }
}
