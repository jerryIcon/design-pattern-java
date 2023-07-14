package com.jerryicon.design.AbstractFactory.ExpandCompute;

public class AMDCpu implements CPUApi {
    // 针脚数
    Integer pins;

    public AMDCpu(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("开始计算");
    }
}
