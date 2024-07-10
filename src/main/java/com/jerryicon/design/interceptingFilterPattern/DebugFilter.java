package com.jerryicon.design.interceptingFilterPattern;

/**
 * @author JerryIcon
 * @date 2024/7/10 上午11:44
 */
public class DebugFilter implements Filter{
    @Override
    public void execute(String request) {
        System.out.println("Request log: " + request);
    }
}
