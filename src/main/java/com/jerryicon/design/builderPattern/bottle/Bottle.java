package com.jerryicon.design.builderPattern.bottle;

import com.jerryicon.design.builderPattern.Packing;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午11:37
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
