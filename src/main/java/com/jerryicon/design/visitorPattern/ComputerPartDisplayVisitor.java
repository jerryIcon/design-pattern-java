package com.jerryicon.design.visitorPattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("Displaying KeyBoard");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor");
    }
}
