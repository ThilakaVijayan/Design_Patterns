package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices;

public class GarageDoor {
    public void up(){
        System.out.println("Garage Door is Open");
    }
    public void down(){
        System.out.println("Garage Door is Down");
    }
    public void stop(){
        System.out.println("Garage Door is Stopped");
    }
    public void lightOn(){
        System.out.println("Garage Light is On");
    }
    public void lightOff(){
        System.out.println("Garage Light is Off");
    }
}
