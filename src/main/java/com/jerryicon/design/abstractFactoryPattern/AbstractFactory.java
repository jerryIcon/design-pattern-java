package com.jerryicon.design.abstractFactoryPattern;

import com.jerryicon.design.abstractFactoryPattern.Color.Color;
import com.jerryicon.design.abstractFactoryPattern.Shape.Shape;

/**
 * @author JerryIcon
 * @date 2024/7/3 下午4:54
 */
public abstract class AbstractFactory {

    protected abstract Color getColor(String color);

    protected abstract Shape getShape(String shape);
}
