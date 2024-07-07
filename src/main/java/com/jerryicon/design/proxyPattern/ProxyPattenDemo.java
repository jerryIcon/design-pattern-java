package com.jerryicon.design.proxyPattern;

public class ProxyPattenDemo {

    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("test");

        proxyImage.display();

        proxyImage.display();
    }
}
