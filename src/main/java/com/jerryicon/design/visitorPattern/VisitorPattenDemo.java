package com.jerryicon.design.visitorPattern;

public class VisitorPattenDemo {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

    }
}
