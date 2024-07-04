package com.jerryicon.design.adapterPattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午3:20
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;


    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            MediaAdapter adapter = new MediaAdapter(audioType);
            adapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media type. Cannot play.");
        }
    }
}
