package com.jerryicon.design.builderPattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午11:48
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        mealBuilder.prepareVegMeal().showItems();

        mealBuilder.prepareNonVegMeal().showItems();
    }
}
