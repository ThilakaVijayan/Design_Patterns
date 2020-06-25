package com.thilaka.design.patterns.behavioural.state.mosh.example2.attempt;

public class Main {
    public static void main(String[] args) {
        DirectionService service = new DirectionService(new Driving());
        service.getEta();
        service.getDirection();
    }
}
