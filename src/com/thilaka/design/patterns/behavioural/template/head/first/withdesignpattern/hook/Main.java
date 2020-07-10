package com.thilaka.design.patterns.behavioural.template.head.first.withdesignpattern.hook;

public class Main {
    public static void main(String[] args) {
        var teaHook = new TeaWithHook();
        var coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
