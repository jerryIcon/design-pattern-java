package com.jerryicon.design.bridge;

/**
 * @author JerryIcon
 * @date 2023/7/18 19:26
 */
public class Client {
    public static void main(String[] args) {
        ConcreteRemoteControl1 control1 = new ConcreteRemoteControl1(new Sony());
        control1.off();
        control1.tuneChannel();
        control1.on();
    }
}
