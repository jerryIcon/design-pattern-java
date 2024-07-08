package com.jerryicon.design.mementoPattern;

/**
 * @author JerryIcon
 * @date 2024/7/8 下午4:54
 */
public class MementoPatternDemo {
    public static void main(String[] args) {

        Originator originator = new Originator();

        CareTaker careTaker = new CareTaker();

        originator.setState("#1");

        originator.setState("#2");

        originator.setState("#3");

        careTaker.add(originator.saveStateToMemento());

        originator.setState("#4");

        careTaker.add(originator.saveStateToMemento());

        System.out.println("current state:" + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));

        System.out.println("First saved state:" + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));

        System.out.println("Second saved State: " + originator.getState());
    }
}
