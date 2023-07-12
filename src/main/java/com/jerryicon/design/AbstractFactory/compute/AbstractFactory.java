package com.jerryicon.design.AbstractFactory.compute;

/**
 * 电脑工厂
 */
public interface AbstractFactory {

    // cpu
    CPUApi createCpu();

    // 主板
    MainboardApi createMainboard();

}
