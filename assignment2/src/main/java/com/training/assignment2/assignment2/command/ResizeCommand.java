package com.training.assignment2.assignment2.command;

import com.training.assignment2.assignment2.observer.ImageProcessingMonitor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ResizeCommand implements ImageProcessingOperation {
    private String filename;
    private int width;
    private int height;
    private ImageProcessingMonitor monitor;

    public ResizeCommand(String filename, int width, int height, ImageProcessingMonitor monitor) {
        this.filename = filename;
        this.width = width;
        this.height = height;
        this.monitor = monitor;
    }

    @Override
    public void execute() {
        monitor.operationStatusChanged("Starting resize operation for " + filename);
        log.info("Resizing image " + filename + " to " + width + "x" + height);
        monitor.operationStatusChanged("Finished resize operation for " + filename);

    }
}