package com.thilaka.design.patterns.behavioural.state.mosh.example2.attempt;

public class Bicycling implements TravelMode{
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
