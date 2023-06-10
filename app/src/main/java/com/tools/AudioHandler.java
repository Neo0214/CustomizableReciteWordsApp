package com.tools;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AudioHandler {
    private final MediaPlayer audioPlayer;

    public AudioHandler(){
        audioPlayer=new MediaPlayer();
    }

    public void playAudio(Activity curActivity, int audioResId) {
        try {
            if (audioPlayer.isPlaying()) {
                audioPlayer.stop();
                audioPlayer.reset();
            }

            AssetFileDescriptor assetFileDescriptor = curActivity.getResources().openRawResourceFd(audioResId);
            if (assetFileDescriptor != null) {
                audioPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                assetFileDescriptor.close();

                audioPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        audioPlayer.start();
                    }
                });

                audioPlayer.prepareAsync();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stopAudio() {
        if (audioPlayer.isPlaying()) {
            audioPlayer.stop();
            audioPlayer.reset();
        }
    }

}