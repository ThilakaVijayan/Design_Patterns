package com.thilaka.design.patterns.behavioural.command.pluralsight.example2;

public class Main {
    public static void main(String[] args) {
        var light = new Light();
        var lightSwitch = new Switch();

        Command onCommand = new OnCommand(light);
        lightSwitch.storeAndExecute(onCommand);
    }
}
