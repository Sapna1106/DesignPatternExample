package com.training.assignment2.assignment2.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogMonitor implements ImageOperationObserver{
    @Override
    public void update(String message) {
        log.info("Logging: " + message);
    }
}
