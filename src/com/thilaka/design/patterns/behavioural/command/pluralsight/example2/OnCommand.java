package com.thilaka.design.patterns.behavioural.command.pluralsight.example2;

//concrete command
public class OnCommand implements Command {

    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
