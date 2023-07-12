package com.jerryicon.design.AbstractFactory.compute;

public class Schema1 implements AbstractFactory{
    @Override
    public CPUApi createCpu() {
        return new IntelCpu(1156);
    }

    @Override
    public MainboardApi createMainboard() {
        return new GAMMainboard(1156);
    }
}
