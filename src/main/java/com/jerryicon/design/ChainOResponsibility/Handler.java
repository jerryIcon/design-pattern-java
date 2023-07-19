package com.jerryicon.design.ChainOResponsibility;

/**
 * @author JerryIcon
 * @date 2023/7/19 10:46
 */
public abstract class Handler {

    protected Handler successor;

    public Handler(Handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
