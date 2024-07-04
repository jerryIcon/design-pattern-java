package com.jerryicon.design.bridgePattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午4:02
 */
public class BridgePatternDemo {
    public static void main(String[] args) {

        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
