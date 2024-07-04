package com.jerryicon.design.prototypePattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午2:18
 */
public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
