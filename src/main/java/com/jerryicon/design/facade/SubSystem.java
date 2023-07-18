package com.jerryicon.design.facade;

/**
 * @author JerryIcon
 * @date 2023/7/18 17:57
 */
public class SubSystem {
    public void turnOnTV() {
        System.out.println("turnOnTV()");
    }

    public void setCD(String cd) {
        System.out.println("setCD( " + cd + " )");
    }

    public void starWatching(){
        System.out.println("starWatching()");
    }
}
