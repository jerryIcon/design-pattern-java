package com.jerryicon.design.builder.example1;

/**
 * @author JerryIcon
 * @date 2023/7/14 15:26
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart();
    }
}
