package com.jerryicon.design.decorator;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        System.out.println("加牛奶");
        return 1 + beverage.cost();
    }
}
