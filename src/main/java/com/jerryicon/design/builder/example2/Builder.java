package com.jerryicon.design.builder.example2;

/**
 * @author JerryIcon
 * @date 2023/8/14 11:10
 */
public abstract class Builder {
    private Computer computer = null;

    abstract void buildBoard(String board);
    abstract void buildDisplay(String display);
    abstract void buildOs();
    abstract Computer build();
}
