package com.jerryicon.design.interceptingFilterPattern;

/**
 * @author JerryIcon
 * @date 2024/7/10 上午11:48
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {

        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
