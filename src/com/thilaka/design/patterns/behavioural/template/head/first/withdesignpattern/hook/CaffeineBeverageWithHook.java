package com.thilaka.design.patterns.behavioural.template.head.first.withdesignpattern.hook;

public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }

    }

    protected abstract void brew();
    protected abstract void addCondiments();

    protected void boilWater(){
        System.out.println("Boiling water");
    }

    protected void pourInCup(){
        System.out.println("Pouring into cup");
    }

    //this is a hook method. the subclasses can override it, but don't have to.
    protected boolean customerWantsCondiments(){
        return true;
    }
}
