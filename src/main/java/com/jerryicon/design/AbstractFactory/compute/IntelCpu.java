package com.jerryicon.design.AbstractFactory.compute;

public class IntelCpu implements CPUApi{

    // 针脚数
    Integer pins;

    public IntelCpu(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("开始计算");
    }
}
