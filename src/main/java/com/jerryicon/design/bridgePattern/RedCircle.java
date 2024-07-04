package com.jerryicon.design.bridgePattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午3:48
 */
public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing a red circle at (" + x + ", " + y + ") with radius " + radius);
    }
}
