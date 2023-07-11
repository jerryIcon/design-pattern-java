package com.jerryicon.design.singleton;

/**
 * 懒汉式-线程不安全
 */
public class Singleton0 {
    private static Singleton0 uniqueInstance;

    private Singleton0() {
    }

    public static Singleton0 getUniqueInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton0();
        }
        return uniqueInstance;
    }
}
