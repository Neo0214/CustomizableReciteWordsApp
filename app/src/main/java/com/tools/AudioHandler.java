package com.tools;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;


import com.example.customizablerecitewordsapp.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AudioHandler {
    private MediaPlayer audioPlayer;
    private List<Integer> audioFiles;
    private int curAudio; // current audio file pointer

    public AudioHandler(){
        audioPlayer=new MediaPlayer();
        curAudio=0;
        audioFiles=new ArrayList<>();
        audioFiles.add(R.raw.testaudio);
    }

    public void playNextAudio(Activity curActivity){
        audioPlayer.stop();
        audioPlayer.reset();
        if (curAudio==audioFiles.size()){
            return;
        }
        //
        int nextAudioFile = audioFiles.get(curAudio++);
        try{
            audioPlayer.setDataSource(curActivity.getResources().openRawResourceFd(nextAudioFile));
        }catch(IOException IOError){
            IOError.printStackTrace();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }catch(IllegalStateException e){
           e.printStackTrace();
        }
        audioPlayer.start();
    }
}
