package com.jerryicon.design.bridge;

/**
 * @author JerryIcon
 * @date 2023/7/18 19:26
 */
public class ConcreteRemoteControl1 extends RemoteControl{
    public ConcreteRemoteControl1(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        tv.on();
    }

    @Override
    public void off() {
        tv.off();
    }

    @Override
    public void tuneChannel() {
        tv.tuneChannel();
    }
}
