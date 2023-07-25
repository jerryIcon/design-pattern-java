package com.jerryicon.design.TemplateMethod;

public class Client {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
