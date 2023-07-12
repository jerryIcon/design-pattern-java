package com.jerryicon.design.AbstractFactory.compute;

public class GAMMainboard implements MainboardApi{
    // 插孔数
    Integer cpuHoles;

    public GAMMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("安装cpu");
    }
}
