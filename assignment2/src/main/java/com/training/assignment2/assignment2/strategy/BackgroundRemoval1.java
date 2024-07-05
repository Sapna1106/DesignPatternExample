package com.training.assignment2.assignment2.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BackgroundRemoval1 implements BackgroundRemovalStrategy{
    public void removeBackground(String filename) {
        log.info("Removing background of " + filename + " using background removal strategy 1");
    }
}
