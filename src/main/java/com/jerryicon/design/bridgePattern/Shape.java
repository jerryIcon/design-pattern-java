package com.jerryicon.design.bridgePattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午3:52
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
