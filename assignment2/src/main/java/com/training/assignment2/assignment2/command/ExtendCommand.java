package com.training.assignment2.assignment2.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExtendCommand implements ImageProcessingOperation {
    private String filename;
    private String direction;
    private int pixels;

    public ExtendCommand(String filename, String direction, int pixels) {
        this.filename = filename;
        this.direction = direction;
        this.pixels = pixels;
    }

    @Override
    public void execute() {
        log.info("Extending image " + filename + " by " + pixels + " pixels to the " + direction);
    }
}
