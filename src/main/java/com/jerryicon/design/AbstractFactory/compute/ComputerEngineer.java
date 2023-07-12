package com.jerryicon.design.AbstractFactory.compute;

public class ComputerEngineer {

    private CPUApi cpuApi = null;

    private MainboardApi mainboardApi = null;

    public void makeComputer(AbstractFactory schema){
        prepareHardwares(schema);
    }

    private void prepareHardwares(AbstractFactory schema){
        this.cpuApi = schema.createCpu();
        this.mainboardApi = schema.createMainboard();

        // 测试
        this.cpuApi.calculate();
        this.mainboardApi.installCPU();
    }

}
