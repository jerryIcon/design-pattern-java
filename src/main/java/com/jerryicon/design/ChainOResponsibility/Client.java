package com.jerryicon.design.ChainOResponsibility;

/**
 * @author JerryIcon
 * @date 2023/7/19 10:52
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);
        Request request1 = new Request( "request1",RequestType.type1);
        handler2.handleRequest(request1);
        Request request2 = new Request("request2", RequestType.type2);
        handler2.handleRequest(request2);
    }
}
