package com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.ducks;

import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.fly.FlyNoWay;
import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Looks like decoy duck");
    }
}
