package com.jerryicon.design.AbstractFactory.compute;

public class Schema2 implements AbstractFactory{
    @Override
    public CPUApi createCpu() {
        return new IntelCpu(939);
    }

    @Override
    public MainboardApi createMainboard() {
        return new MSIMainboard(939);
    }
}
