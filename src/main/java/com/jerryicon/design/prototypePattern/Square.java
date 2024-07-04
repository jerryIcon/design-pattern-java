package com.jerryicon.design.prototypePattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午2:19
 */
public class Square extends Shape{

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
