package com.jerryicon.design.flyweight;

/**
 * @author JerryIcon
 * @date 2023/7/19 8:50
 */
public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight1 = flyweightFactory.getFlyweight("aa");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("aa");
        flyweight1.doOperation("x");
        flyweight2.doOperation("y");
    }
}
