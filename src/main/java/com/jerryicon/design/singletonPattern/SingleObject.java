package com.jerryicon.design.singletonPattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 上午9:41
 */
public enum SingleObject {
    INSTANCE;
    void getObject(){
        System.out.println("获取单例对象");
    }
}
