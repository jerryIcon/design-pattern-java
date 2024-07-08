package com.jerryicon.design.mementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JerryIcon
 * @date 2024/7/8 下午4:52
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
       return mementoList.get(index);
    }
}
