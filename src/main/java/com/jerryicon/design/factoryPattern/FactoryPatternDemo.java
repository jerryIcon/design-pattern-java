package com.jerryicon.design.factoryPattern;

/**
 * @author JerryIcon
 * @date 2024/7/3 下午4:18
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        factory.getShape("CIRCLE").draw();

        factory.getShape("RECTANGLE").draw();

        factory.getShape("SQUARE").draw();
    }
}
