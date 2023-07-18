package com.jerryicon.design.facade;

/**
 * @author JerryIcon
 * @date 2023/7/18 17:58
 */
public class Client {
    private Facade facade;

    public Client(Facade facade){
        this.facade = new Facade();
    }

    public void watch(){
        facade.watchMovie();
    }
}
