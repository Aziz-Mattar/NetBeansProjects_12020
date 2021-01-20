/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author aziz
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;
    
    MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer = new vlcPlayer();
        else if(audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer = new mp4Player();
    }
    
    @Override
    public void play(String audioType,String fileName) {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer.playVlc(fileName);
        else if(audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer.playMp4(fileName);
    }
    
}
