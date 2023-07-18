package com.jerryicon.design.facade;

/**
 * @author JerryIcon
 * @date 2023/7/18 17:57
 */
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie(){
        subSystem.turnOnTV();
        subSystem.setCD("a movie");
        subSystem.starWatching();
    }
}
