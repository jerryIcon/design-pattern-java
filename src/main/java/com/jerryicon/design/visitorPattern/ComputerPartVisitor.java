package com.jerryicon.design.visitorPattern;

public interface ComputerPartVisitor {

    void visit(KeyBoard keyBoard);

    void visit(Mouse mouse);

    void visit(Monitor monitor);
}
