package com.jerryicon.design.singletonPattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午9:42
 */
public class SingleonPattern {
    public static void main(String[] args) {
        SingleObject object = SingleObject.INSTANCE;

        object.getObject();
    }
}
