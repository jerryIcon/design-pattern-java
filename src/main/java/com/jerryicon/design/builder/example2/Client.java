package com.jerryicon.design.builder.example2;

/**
 * @author JerryIcon
 * @date 2023/8/14 11:16
 */
public class Client {
    public static void main(String[] args) {
        MacBookBuilder macBookBuilder = new MacBookBuilder();
        Director director = new Director(macBookBuilder);
        director.builder("英特尔主板","Retina显示器");

        Computer build = macBookBuilder.build();
        System.out.println(build);
    }
}
