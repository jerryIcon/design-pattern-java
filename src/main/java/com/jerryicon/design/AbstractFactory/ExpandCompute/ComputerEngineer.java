package com.jerryicon.design.AbstractFactory.ExpandCompute;

public class ComputerEngineer {


    public void makeComputer(AbstractFactory schema){
        prepareHardwares(schema);
    }

    private void prepareHardwares(AbstractFactory schema){
        CPUApi cpuApi = (CPUApi) schema.createProduct(1);
        MainboardApi mainboardApi = (MainboardApi) schema.createProduct(1);
        MemoryApi memoryApi = (MemoryApi) schema.createProduct(3);

        //测试一下配件是否好用
        cpuApi.calculate();
        mainboardApi.installCPU();
        memoryApi.cacheData();

    }

}
