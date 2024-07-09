package com.jerryicon.design.compositeEntityPattern;


/**
 * @author JerryIcon
 * @date 2024/7/9 上午11:26
 */
public class CompositeEntityPatternDemo {

    public static void main(String[] args) {

        Client client = new Client();
        client.setData("Test", "Data");

        client.printData();

        client.setData("Second Test", "Data1");
        client.printData();
    }
}
