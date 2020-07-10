package com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern;

import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.fly.FlyRocketPowered;
import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.quack.Quack;
import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.ducks.Duck;
import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.ducks.MallardDuck;
import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.ducks.ModelDuck;
import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.others.DuckCall;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        DuckCall duckCall = new DuckCall(new Quack());
        duckCall.performQuack();
    }
}
