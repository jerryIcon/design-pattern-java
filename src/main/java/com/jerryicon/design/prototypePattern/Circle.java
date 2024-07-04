package com.jerryicon.design.prototypePattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午2:17
 */
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }


    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
