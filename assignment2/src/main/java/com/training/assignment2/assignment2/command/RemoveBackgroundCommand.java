package com.training.assignment2.assignment2.command;

import com.training.assignment2.assignment2.observer.ImageProcessingMonitor;
import com.training.assignment2.assignment2.strategy.BackgroundRemovalStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveBackgroundCommand implements ImageProcessingOperation {
    private String imagePath;
    private BackgroundRemovalStrategy backgroundRemovalStrategy;
    private ImageProcessingMonitor monitor;

    public RemoveBackgroundCommand(String imagePath, BackgroundRemovalStrategy strategy, ImageProcessingMonitor monitor) {
        this.imagePath = imagePath;
        this.backgroundRemovalStrategy = strategy;
        this.monitor = monitor;
    }

    @Override
    public void execute() {
        monitor.operationStatusChanged("Starting background removal for " + imagePath);
        backgroundRemovalStrategy.removeBackground(imagePath);
        monitor.operationStatusChanged("Finished background removal for " + imagePath);
    }
}
