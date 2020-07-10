package com.thilaka.design.patterns.behavioural.template.head.first.withdesignpattern;

public class Tea extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
