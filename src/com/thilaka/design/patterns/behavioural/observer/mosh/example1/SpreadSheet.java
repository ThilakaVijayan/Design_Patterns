package com.thilaka.design.patterns.behavioural.observer.mosh.example1;

public class SpreadSheet implements Observer{
    @Override
    public void update() {
        System.out.println("SpreadSheet got notified.");
    }
}
