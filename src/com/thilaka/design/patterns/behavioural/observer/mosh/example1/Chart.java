package com.thilaka.design.patterns.behavioural.observer.mosh.example1;

public class Chart implements Observer{
    @Override
    public void update() {
        System.out.println("Chart got updated");
    }
}
