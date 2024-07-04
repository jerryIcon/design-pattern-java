package com.jerryicon.design.adapterPattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午3:24
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4", "test.mp4");

        audioPlayer.play("mp3", "test.mp3");

        audioPlayer.play("vlc","test.vlc");

        audioPlayer.play("txt", "test.txt");
    }
}
