package com.training.assignment2.assignment2.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AIDriven2 implements AIDrivenStrategy{
    @Override
    public void extendImage(String filename, String direction, int pixels) {
        log.info("Extending image " + filename + " by " + pixels + " pixels to the " + direction + " using AI strategy 2");
    }
}
