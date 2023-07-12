package com.jerryicon.design.AbstractFactory.demo;

public class Client {
    public static void main(String[] args) {
        AbstractFactory concreteFactory1 = new ConcreteFactory1();
        concreteFactory1.createProductA();
        concreteFactory1.createProductB();
    }
}
