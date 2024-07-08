package com.jerryicon.design.observerPattern;

/**
 * @author JerryIcon
 * @date 2024/7/8 下午5:11
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new BinaryObserver(subject);

        new OctalObserver(subject);

        new HexaObserver(subject);

        subject.setState(10);

        System.out.println("-----------------------");

        subject.setState(25);

    }
}
