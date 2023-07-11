package com.jerryicon.design.singleton;

/**
 * 静态内部类实现-线程安全
 */
public class Singleton4 {
    private Singleton4(){

    }

     private static class SingletonHolder{
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getUniqueInstance(){
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {

    }
}
