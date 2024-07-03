package com.jerryicon.design.abstractFactoryPattern.Shape;

/**
 * @author JerryIcon
 * @date 2024/7/3 下午4:13
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}
