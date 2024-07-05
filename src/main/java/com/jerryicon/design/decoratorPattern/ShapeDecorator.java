package com.jerryicon.design.decoratorPattern;

/**
 * @author JerryIcon
 * @date 2024/7/5 上午10:48
 */
public abstract class ShapeDecorator implements Shape{

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public abstract void draw();

}
