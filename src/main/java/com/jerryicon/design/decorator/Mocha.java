package com.jerryicon.design.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        System.out.println("加摩卡");
        return 1 + beverage.cost();
    }
}
