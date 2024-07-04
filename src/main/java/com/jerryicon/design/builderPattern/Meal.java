package com.jerryicon.design.builderPattern;

import java.util.ArrayList;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午11:44
 */
public class Meal {

    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        // 计算价格
        return items.stream().map(Item::price).reduce(Float::sum).orElse(0.0f);
    }

    public void showItems(){
        for(Item item : items){
            System.out.println(item.name() + " " + item.packing().pack()+ " " + item.price());
        }
    }
}
