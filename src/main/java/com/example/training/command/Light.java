package com.example.training.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Light {
    public void on() {
        log.info("The light is on.");
    }

    public void off() {
        log.info("The light is off.");
    }
}
