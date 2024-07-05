package com.jerryicon.design.decoratorPattern;

/**
 * @author JerryIcon
 * @date 2024/7/5 上午10:50
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder();
    }

    public void setRedBorder(){
        System.out.println("Border Color: Red");
    }
}
