package com.thilaka.design.patterns.behavioural.observer.mosh.example1.pushstyle;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Chart got updated: " + value);
    }
}
