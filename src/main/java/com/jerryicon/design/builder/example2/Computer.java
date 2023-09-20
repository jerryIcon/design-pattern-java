package com.jerryicon.design.builder.example2;

/**
 * @author JerryIcon
 * @date 2023/8/14 11:05
 */
public abstract class Computer {
    protected String display;

    protected String keyboard;

    protected String os;

    public Computer(){

    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public abstract void setOs(String os);

    @Override
    public String toString() {
        return "Computer{" +
                "display='" + display + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
