package com.jerryicon.design.AbstractFactory.compute;

public class MSIMainboard implements MainboardApi{

    // 插孔数
    Integer cpuHoles;

    public MSIMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("安装cpu");
    }
}
