package com.company;

public class EngineClass implements Engine{
    @Override
    public void startEngine() {
        System.out.println("Start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}
