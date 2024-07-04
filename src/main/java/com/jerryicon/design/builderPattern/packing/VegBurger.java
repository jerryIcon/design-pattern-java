package com.jerryicon.design.builderPattern.packing;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午11:41
 */
public class VegBurger extends Burger{

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }

}
