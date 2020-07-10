package com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}
