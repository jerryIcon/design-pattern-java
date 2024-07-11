package com.jerryicon.design.serviceLocatorPattern;

/**
 * @author JerryIcon
 * @date 2024/7/10 下午12:01
 */
public class Service2 implements Service{
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2" );
    }
}
