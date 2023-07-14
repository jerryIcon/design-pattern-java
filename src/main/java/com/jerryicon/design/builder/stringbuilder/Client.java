package com.jerryicon.design.builder.stringbuilder;

/**
 * @author JerryIcon
 * @date 2023/7/13 19:55
 */
public class Client {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        final int count = 26;
        for (int i = 0; i < count; i++) {
            stringBuilder.append((char) ('a' + i));
        }
        System.out.println(stringBuilder.toString());
    }
}
