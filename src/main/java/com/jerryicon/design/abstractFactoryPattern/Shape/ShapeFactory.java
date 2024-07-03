package com.jerryicon.design.abstractFactoryPattern.Shape;

import com.jerryicon.design.abstractFactoryPattern.AbstractFactory;
import com.jerryicon.design.abstractFactoryPattern.Color.Color;

/**
 * @author JerryIcon
 * @date 2024/7/3 下午4:17
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    protected Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
