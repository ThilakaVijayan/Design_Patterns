package com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.ducks;

import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.fly.FlyNoWay;
import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Looks like Model duck");
    }
}
