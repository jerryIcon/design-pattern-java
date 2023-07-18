package com.jerryicon.design.decorator;

public class Client {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend);
        houseBlend = new Mocha(houseBlend);
        System.out.println(houseBlend.cost());
    }
}
