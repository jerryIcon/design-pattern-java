package com.jerryicon.design.adapter;

/**
 * @author JerryIcon
 * @date 2023/7/18 18:59
 */
public class Client {
    public static void main(String[] args) {
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        turkeyAdapter.quack();
        // 适配turkey的gobble
    }
}
