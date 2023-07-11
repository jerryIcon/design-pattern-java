package com.jerryicon.design.SimpleFactory;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //通过简单工厂来获取接口对象
        Api api = Factory.create("A");
        api.operation();
    }
}
