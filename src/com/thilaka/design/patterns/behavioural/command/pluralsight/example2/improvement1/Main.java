package com.thilaka.design.patterns.behavioural.command.pluralsight.example2.improvement1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var bedroomLight = new Light();
        var kitchenLight = new Light();
        var lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);

        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
