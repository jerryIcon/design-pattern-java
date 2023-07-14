package com.jerryicon.design.AbstractFactory.ExpandCompute;

public class Schema2 implements AbstractFactory {

    @Override
    public Object createProduct(int type) {
        Object retObj = null;
        //type为1表示创建CPU，type为2表示创建主板
        if(type==1){
            retObj = new IntelCpu(939);
        }else if(type==2){
            retObj = new GAMMainboard(939);
        }else if(type==3){
            retObj = new HyMemory();
        }
        return retObj;
    }
}
