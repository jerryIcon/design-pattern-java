package com.jerryicon.design.decoratorPattern;

/**
 * @author JerryIcon
 * @date 2024/7/5 上午10:48
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
