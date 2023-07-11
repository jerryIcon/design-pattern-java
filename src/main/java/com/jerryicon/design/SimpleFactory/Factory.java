package com.jerryicon.design.SimpleFactory;

/**
 * 工厂类
 */
public class Factory {
    public static Api create(String condition){
        Api api = null;
        if(condition.equals("A")){
            api = new ImplA();
        } else if (condition.equals("B")) {
            api = new ImplB();
        }
        return api;
    }
}
