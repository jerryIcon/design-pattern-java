package com.jerryicon.design.interceptingFilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JerryIcon
 * @date 2024/7/10 上午11:44
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();

    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
