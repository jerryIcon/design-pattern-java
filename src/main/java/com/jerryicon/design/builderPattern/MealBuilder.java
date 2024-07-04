package com.jerryicon.design.builderPattern;

import com.jerryicon.design.builderPattern.bottle.Coke;
import com.jerryicon.design.builderPattern.bottle.Pepsi;
import com.jerryicon.design.builderPattern.packing.ChickenBurger;
import com.jerryicon.design.builderPattern.packing.VegBurger;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午11:47
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
