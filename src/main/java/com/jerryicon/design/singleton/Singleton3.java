package com.jerryicon.design.singleton;

/**
 * 双重校验锁-线程安全
 */
public class Singleton3 {
    private static Singleton3 uniqueInstance;

    private Singleton3(){}

    public static Singleton3 getUniqueInstance(){
        if(uniqueInstance == null){
            // synchronized指定锁对象为Class对象-所有线程需要的锁都是同一把
            synchronized (Singleton3.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }
}
