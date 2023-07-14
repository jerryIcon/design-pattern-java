package com.jerryicon.design.AbstractFactory.ExpandCompute;

/**
 * @author JerryIcon
 * @date 2023/7/13 19:26
 */
public class HyMemory implements MemoryApi{
    @Override
    public void cacheData() {
        System.out.println("cache");
    }
}
