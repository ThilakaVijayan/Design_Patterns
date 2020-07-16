package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices;

public class Hottub {
    private int temperature;

    public void circulate(){
        System.out.println("Hottub is circulating");
    }

    public void jetsOn(){
        System.out.println("Hottub jets are on");
    }

    public void jetsOff(){
        System.out.println("Hottub jets are off");
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("Hottub temperature is set to " + this.temperature);
    }
}
