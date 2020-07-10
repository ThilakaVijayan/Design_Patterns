package com.thilaka.design.patterns.behavioural.iterator.head.first.withdesignpattern;

public class Main {
    public static void main(String[] args) {
        var pancakeHouseMenu = new PancakeHouseMenu();
        var dinerMenu = new DinerMenu();

        var waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
