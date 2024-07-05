package com.training.assignment2.assignment2.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CropCommand implements ImageProcessingOperation {
    private String filename;
    private int top;
    private int right;
    private int bottom;
    private int left;

    public CropCommand(String filename, int top, int right, int bottom, int left) {
        this.filename = filename;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
    }

    @Override
    public void execute() {
        log.info("Cropping image " + filename + " with top=" + top + ", right=" + right +
                ", bottom=" + bottom + ", left=" + left);
    }
}
