package com.thilaka.design.patterns.behavioural.command.head.first;

//Client
public class Main {
    public static void main(String[] args) {
        var remote = new SimpleRemoteControl();//Invoker

        var light = new Light();
        var garageDoor = new GarageDoor();

        var lightOn = new LightOnCommand(light);//Command
        var garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
