package com.jerryicon.design.TemplateMethod;

public abstract class CaffeineBeverage {

    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    private void boilWater(){
        System.out.println("boilWater");
    }

    private void pourInCup(){
        System.out.println("pourInCup");
    }

}
