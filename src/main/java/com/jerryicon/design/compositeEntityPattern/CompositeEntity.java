package com.jerryicon.design.compositeEntityPattern;

/**
 * @author JerryIcon
 * @date 2024/7/9 上午11:23
 */
public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
