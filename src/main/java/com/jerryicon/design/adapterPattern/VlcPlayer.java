package com.jerryicon.design.adapterPattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午3:17
 */
public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
