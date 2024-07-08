package com.jerryicon.design.visitorPattern;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
