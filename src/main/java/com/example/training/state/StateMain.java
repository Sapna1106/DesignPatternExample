package com.example.training.state;

public class StateMain {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.stop();
        mediaPlayer.play();
        mediaPlayer.pause();
        mediaPlayer.play();
        mediaPlayer.stop();
        mediaPlayer.pause();
    }
}
