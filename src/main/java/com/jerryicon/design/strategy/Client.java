package com.jerryicon.design.strategy;

/**
 * @author JerryIcon
 * @date 2023/7/19 14:40
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
    }
}
