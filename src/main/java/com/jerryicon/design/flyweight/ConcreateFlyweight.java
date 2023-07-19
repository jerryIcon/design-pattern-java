package com.jerryicon.design.flyweight;

/**
 * @author JerryIcon
 * @date 2023/7/19 8:45
 */
public class ConcreateFlyweight implements Flyweight{

    private final String intrinsicState;

    public ConcreateFlyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }


    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Hash:" + System.identityHashCode(this));
        System.out.println("intrinsicState:" + intrinsicState);
        System.out.println("ExtrinsicState:" + extrinsicState);
    }
}
