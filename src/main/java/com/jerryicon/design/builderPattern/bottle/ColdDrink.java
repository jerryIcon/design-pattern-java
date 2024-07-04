package com.jerryicon.design.builderPattern.bottle;

import com.jerryicon.design.builderPattern.Item;
import com.jerryicon.design.builderPattern.Packing;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午11:38
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();

}
