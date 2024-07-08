package com.jerryicon.design.mementoPattern;

/**
 * @author JerryIcon
 * @date 2024/7/8 下午4:49
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
