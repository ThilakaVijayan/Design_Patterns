package com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Flying with a rocket!");
    }
}
