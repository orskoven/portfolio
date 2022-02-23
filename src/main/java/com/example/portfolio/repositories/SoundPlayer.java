package com.example.portfolio.repositories;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundPlayer {

    public SoundPlayer(String filename){
        try
        {
            Clip clip = AudioSystem.getClip();
            ((Clip) clip).open(AudioSystem.getAudioInputStream(new File(filename)));
            clip.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }
}
