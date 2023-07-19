package com.jerryicon.design.strategy;

/**
 * @author JerryIcon
 * @date 2023/7/19 14:39
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
