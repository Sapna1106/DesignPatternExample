package com.example.training.state;

public interface State {
    void play(MediaPlayer mediaPlayer);
    void pause(MediaPlayer mediaPlayer);
    void stop(MediaPlayer mediaPlayer);
}
