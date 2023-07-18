package com.jerryicon.design.composite;

/**
 * @author JerryIcon
 * @date 2023/7/18 19:47
 */
public abstract class Component {

    public String name;

    public Component(String name){
        this.name = name;
    }

    public void print(){
        print(0);
    }

    abstract void print(int level);

    abstract public void add(Component component);

    abstract public void remove(Component component);
}
