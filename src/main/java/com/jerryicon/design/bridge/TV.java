package com.jerryicon.design.bridge;

/**
 * TV 表示电视，指代 Implementor。
 * @author JerryIcon
 * @date 2023/7/18 19:23
 */
public abstract class TV {
    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
