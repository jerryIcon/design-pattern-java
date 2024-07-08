package com.jerryicon.design.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JerryIcon
 * @date 2024/7/8 下午5:05
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObserver(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
