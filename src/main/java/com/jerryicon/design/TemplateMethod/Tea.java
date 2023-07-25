package com.jerryicon.design.TemplateMethod;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("tea addCondiments");
    }
}
