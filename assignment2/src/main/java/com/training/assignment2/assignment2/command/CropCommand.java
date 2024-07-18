package com.training.assignment2.assignment2.command;

import com.training.assignment2.assignment2.observer.ImageProcessingMonitor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CropCommand implements ImageProcessingOperation {
    private String filename;
    private int top;
    private int right;
    private int bottom;
    private int left;
    ImageProcessingMonitor monitor;

    public CropCommand(String filename, int top, int right, int bottom, int left, ImageProcessingMonitor monitor) {
        this.filename = filename;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
        this.monitor = monitor;
    }

    @Override
    public void execute() {
        monitor.operationStatusChanged("Starting crop operation for " + filename);
        log.info("Cropping image " + filename + " with top=" + top + ", right=" + right +
                ", bottom=" + bottom + ", left=" + left);
        monitor.operationStatusChanged("Finished crop operation for " + filename);
    }
}
