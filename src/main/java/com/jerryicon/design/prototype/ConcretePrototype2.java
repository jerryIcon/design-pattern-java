package com.jerryicon.design.prototype;

/**
 * @author JerryIcon
 * @date 2023/7/18 17:46
 */
public class ConcretePrototype2 implements Prototype{
    @Override
    public Prototype clone() {
        return new ConcretePrototype2();
    }
}
