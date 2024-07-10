package com.jerryicon.design.interceptingFilterPattern;

/**
 * @author JerryIcon
 * @date 2024/7/10 上午11:48
 */
public class Client {
    private FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
