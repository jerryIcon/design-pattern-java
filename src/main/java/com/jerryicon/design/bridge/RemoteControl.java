package com.jerryicon.design.bridge;

/**
 * RemoteControl 表示遥控器，指代 Abstraction。
 * @author JerryIcon
 * @date 2023/7/18 19:24
 */
public abstract class RemoteControl {
    public TV tv;

    public RemoteControl(TV tv){
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
