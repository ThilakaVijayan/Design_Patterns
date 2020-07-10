package com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.others;

import com.thilaka.design.patterns.behavioural.strategy.head.first.withdesignpattern.behavior.quack.QuackBehavior;

public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }
}
