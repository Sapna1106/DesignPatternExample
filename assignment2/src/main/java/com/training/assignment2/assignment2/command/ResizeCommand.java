package com.training.assignment2.assignment2.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ResizeCommand implements ImageProcessingOperation {
    private String filename;
    private int width;
    private int height;

    public ResizeCommand(String filename, int width, int height) {
        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    @Override
    public void execute() {
        log.info("Resizing image " + filename + " to " + width + "x" + height);

    }
}