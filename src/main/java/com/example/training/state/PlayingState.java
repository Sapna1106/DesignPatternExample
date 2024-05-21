package com.example.training.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlayingState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        log.info("Resuming the media.");
        mediaPlayer.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        log.info("The media is already paused.");
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        log.info("Stopping the media.");
        mediaPlayer.setState(new StoppedState());
    }
}