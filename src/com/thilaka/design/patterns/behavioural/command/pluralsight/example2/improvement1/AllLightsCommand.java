package com.thilaka.design.patterns.behavioural.command.pluralsight.example2.improvement1;

import java.util.List;

public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light: lights) {
            if (light.isOn())
                light.toggle();
        }

    }
}
