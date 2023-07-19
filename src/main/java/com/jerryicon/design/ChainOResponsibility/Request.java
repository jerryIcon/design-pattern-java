package com.jerryicon.design.ChainOResponsibility;

/**
 * @author JerryIcon
 * @date 2023/7/19 10:49
 */
public class Request {
    private String name;

    private RequestType type;

    public Request(String name, RequestType type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public RequestType getType() {
        return type;
    }
}
