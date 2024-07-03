package com.jerryicon.design.abstractFactoryPattern.Color;

import com.jerryicon.design.abstractFactoryPattern.AbstractFactory;
import com.jerryicon.design.abstractFactoryPattern.Shape.Shape;

/**
 * @author JerryIcon
 * @date 2024/7/3 下午4:53
 */
public class ColorFactory extends AbstractFactory {

    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    protected Shape getShape(String shape) {
        return null;
    }
}
