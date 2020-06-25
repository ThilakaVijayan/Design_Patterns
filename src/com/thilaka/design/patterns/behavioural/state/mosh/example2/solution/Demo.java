package com.thilaka.design.patterns.behavioural.state.mosh.example2.solution;

public class Demo {
    public static void show() {
        var service = new DirectionService(new Walking());
        service.getEta();
        service.getDirection();
    }
}
