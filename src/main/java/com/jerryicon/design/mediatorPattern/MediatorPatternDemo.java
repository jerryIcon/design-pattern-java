package com.jerryicon.design.mediatorPattern;

/**
 * @author JerryIcon
 * @date 2024/7/8 下午4:40
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {

        User john = new User("John");

        User robert = new User("Robert");

        john.sendMessage("Hi! Robert!");
        robert.sendMessage("Hello! John!");

    }
}
