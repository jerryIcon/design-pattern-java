package com.jerryicon.design.serviceLocatorPattern;

/**
 * @author JerryIcon
 * @date 2024/7/10 下午12:00
 */
public class Service1 implements Service{
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
