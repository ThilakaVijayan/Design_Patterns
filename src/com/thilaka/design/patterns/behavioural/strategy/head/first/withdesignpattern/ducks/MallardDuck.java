package com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.ducks;

import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.fly.FlyWithWings;
import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Looks like a mallard");
    }
}
