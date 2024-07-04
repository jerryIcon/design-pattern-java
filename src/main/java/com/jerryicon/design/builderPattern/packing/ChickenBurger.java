package com.jerryicon.design.builderPattern.packing;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午11:41
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50f;
    }
}
