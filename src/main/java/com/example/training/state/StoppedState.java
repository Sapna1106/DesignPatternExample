package com.example.training.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StoppedState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        log.info("Playing the media.");
        mediaPlayer.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        log.info("The media is already stopped. Can't pause.");
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        log.info("The media is already stopped.");
    }
}
