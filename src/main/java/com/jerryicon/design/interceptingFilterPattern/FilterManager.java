package com.jerryicon.design.interceptingFilterPattern;

/**
 * @author JerryIcon
 * @date 2024/7/10 上午11:45
 */
public class FilterManager {

    private FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
