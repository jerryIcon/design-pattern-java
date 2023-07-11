package com.jerryicon.design.singleton;

/**
 *  懒汉式-线程安全
 *  加入锁synchronized
 */
public class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2(){}

    public static synchronized Singleton2 getUniqueInstance() {
        if(uniqueInstance == null){
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
