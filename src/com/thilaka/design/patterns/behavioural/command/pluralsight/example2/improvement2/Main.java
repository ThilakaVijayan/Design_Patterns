package com.thilaka.design.patterns.behavioural.command.pluralsight.example2.improvement2;

public class Main {
    public static void main(String[] args) {
        var light = new Light();
        var lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(light);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
    }
}
