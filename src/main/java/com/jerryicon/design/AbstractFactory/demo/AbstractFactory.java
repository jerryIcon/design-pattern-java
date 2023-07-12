package com.jerryicon.design.AbstractFactory.demo;

/**
 * 工厂类
 */
public interface AbstractFactory {

    /**
     * @return 抽象产品A的对象
     */
    AbstractProductA createProductA();
    /**
     * @return 抽象产品B的对象
     */
    AbstractProductB createProductB();
}
