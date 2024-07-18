package com.training.assignment2.assignment2.command;

import com.training.assignment2.assignment2.observer.ImageProcessingMonitor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExtendCommand implements ImageProcessingOperation {
    private String filename;
    private String direction;
    private int pixels;
    ImageProcessingMonitor monitor;

    public ExtendCommand(String filename, String direction, int pixels, ImageProcessingMonitor monitor) {
        this.filename = filename;
        this.direction = direction;
        this.pixels = pixels;
        this.monitor = monitor;
    }

    @Override
    public void execute() {
        monitor.operationStatusChanged("Starting extend operation for " + filename);
        log.info("Extending image " + filename + " by " + pixels + " pixels to the " + direction);
        monitor.operationStatusChanged("Finished extend operation for " + filename);
    }
}
