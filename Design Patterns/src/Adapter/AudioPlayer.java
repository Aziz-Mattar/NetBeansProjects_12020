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
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType,String fileName) {
        if(audioType.equalsIgnoreCase("mp4"))
            System.out.println("Playing mp3 file: " + fileName);
        else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else
            System.out.println("Invalid media. "+ audioType + "format not supported");
    }
    
}
