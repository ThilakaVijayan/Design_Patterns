package com.thilaka.design.patterns.behavioural.strategy.head.first.withoutdesignpattern;

public abstract class Duck {
    public void quack(){
        System.out.println("Quaking");
    }

    public void swim(){
        System.out.println("Swimming");
    }

    public void fly(){
        System.out.println("Flying");
    }
    public abstract void display();
}
