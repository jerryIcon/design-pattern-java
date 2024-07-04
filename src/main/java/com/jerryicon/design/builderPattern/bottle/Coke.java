package com.jerryicon.design.builderPattern.bottle;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午11:42
 */
public class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 3f;
    }
}
