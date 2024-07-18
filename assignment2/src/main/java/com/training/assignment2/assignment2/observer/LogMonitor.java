package com.training.assignment2.assignment2.observer;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
public class LogMonitor implements ImageOperationObserver{
    @Override
    public void update(String status) {
        log.info(LocalDateTime.now() + ": " + status);
    }
}
