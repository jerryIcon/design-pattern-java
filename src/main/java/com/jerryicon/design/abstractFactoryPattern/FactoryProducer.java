package com.jerryicon.design.abstractFactoryPattern;

import com.jerryicon.design.abstractFactoryPattern.Color.ColorFactory;
import com.jerryicon.design.abstractFactoryPattern.Shape.ShapeFactory;

/**
 * @author JerryIcon
 * @date 2024/7/3 下午4:56
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }

}
