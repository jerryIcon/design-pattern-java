package com.jerryicon.design.builder.example1;

/**
 * @author JerryIcon
 * @date 2023/7/14 15:23
 */
public class ConcreteBuilder implements Builder{

    /**
     * 产品
     */
    private Product product;

    public Product getResult(){
        return product;
    }


    @Override
    public void buildPart() {
        // 构建
    }
}
