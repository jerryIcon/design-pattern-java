package com.jerryicon.design.prototypePattern;

import java.util.Hashtable;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午2:19
 */
public class ShapeCache {

    public static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String id){
        return shapeMap.get(id).clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
