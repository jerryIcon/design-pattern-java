package com.jerryicon.design.singleton;

/**
 * 饿汉式-线程安全
 * JVM类加载机制
 */
public class Singleton1 {
    private static Singleton1 uniqueInstance = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getUniqueInstance() {
        return uniqueInstance;
    }
}
