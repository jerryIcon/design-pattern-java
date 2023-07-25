package com.jerryicon.design.TemplateMethod;

public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("coffee brew");
    }

    @Override
    void addCondiments() {
        System.out.println("coffee addCondiments");
    }
}
