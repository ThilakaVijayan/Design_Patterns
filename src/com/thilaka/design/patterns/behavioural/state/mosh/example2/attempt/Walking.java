package com.thilaka.design.patterns.behavioural.state.mosh.example2.attempt;

public class Walking implements TravelMode{
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
