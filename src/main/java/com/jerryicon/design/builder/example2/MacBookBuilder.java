package com.jerryicon.design.builder.example2;

/**
 * @author JerryIcon
 * @date 2023/8/14 11:12
 */
public class MacBookBuilder extends Builder{

    private Computer computer = new MacBook();

    @Override
    void buildBoard(String board) {
        computer.setKeyboard(board);
    }

    @Override
    void buildDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    void buildOs() {
        computer.setOs("ios");
    }

    @Override
    Computer build() {
        return computer;
    }
}
