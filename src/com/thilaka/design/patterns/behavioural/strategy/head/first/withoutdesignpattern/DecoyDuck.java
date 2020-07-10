package com.thilaka.design.patterns.behavioural.strategy.head.first.withoutdesignpattern;

public class DecoyDuck extends Duck{
    @Override
    public void quack() {
        //do nothing
    }

    @Override
    public void fly() {
        //do nothing
    }

    @Override
    public void display() {
        System.out.println("Looks like decoy duck");
    }
}
