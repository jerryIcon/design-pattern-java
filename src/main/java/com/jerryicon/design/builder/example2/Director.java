package com.jerryicon.design.builder.example2;

/**
 * @author JerryIcon
 * @date 2023/8/14 11:15
 */
public class Director  {

    Builder builder = null;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void builder(String board,String display){
        builder.buildDisplay(display);
        builder.buildBoard(board);
        builder.buildOs();
    }
}
