package com.jerryicon.design.decoratorPattern;

/**
 * @author JerryIcon
 * @date 2024/7/5 上午10:51
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw();

        rectangle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        redCircle.draw();

        redRectangle.draw();
    }
}
