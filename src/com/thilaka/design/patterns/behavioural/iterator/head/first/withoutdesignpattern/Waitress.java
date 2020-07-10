package com.thilaka.design.patterns.behavioural.iterator.head.first.withoutdesignpattern;

public class Waitress {

    public void printMenu(){
        var pancakeHouseMenu = new PancakeHouseMenu();
        var breakfastItems = pancakeHouseMenu.getMenuItems();

        var dinerMenu = new DinerMenu();
        var lunchItems = dinerMenu.getMenuItems();

        for (MenuItem menuItem : breakfastItems) {
            System.out.print(menuItem.getName() + " ");
            System.out.print(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

        for (MenuItem menuItem : lunchItems) {
            if (menuItem == null)
                break;
            System.out.print(menuItem.getName() + " ");
            System.out.print(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
}
