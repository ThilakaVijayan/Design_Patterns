package com.thilaka.design.patterns.behavioural.strategy.head.first.withoutdesignpattern;

public class RubberDuck extends Duck{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void fly() {
        //do nothing
    }

    @Override
    public void display() {
        System.out.println("Looks like rubber duck");
    }
}
