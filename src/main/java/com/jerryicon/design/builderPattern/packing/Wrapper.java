package com.jerryicon.design.builderPattern.packing;

import com.jerryicon.design.builderPattern.Packing;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午11:37
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
