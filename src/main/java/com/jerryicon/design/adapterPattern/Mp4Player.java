package com.jerryicon.design.adapterPattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午3:17
 */
public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
         System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
