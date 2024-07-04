package com.jerryicon.design.builderPattern.packing;

import com.jerryicon.design.builderPattern.Item;
import com.jerryicon.design.builderPattern.Packing;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午11:40
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
