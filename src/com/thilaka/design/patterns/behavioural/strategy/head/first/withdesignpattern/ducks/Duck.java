package com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.ducks;

import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.fly.FlyBehavior;
import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.quack.QuackBehavior;

public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("Swimming");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
