package com.thilaka.design.patterns.behavioural.command.pluralsight.example2.improvement1;

//concrete command
public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
