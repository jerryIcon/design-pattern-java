package com.jerryicon.design.adapterPattern;

/**
 * @author JerryIcon
 * @date 2024/7/4 下午3:17
 */
public class MediaAdapter implements MediaPlayer{

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }else{
            System.out.println("Invalid media type. Cannot play.");
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(fileName);
        }else{
            System.out.println("Invalid media type. Cannot play.");
        }
    }
}
