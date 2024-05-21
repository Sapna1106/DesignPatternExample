package com.example.training.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Thermostat {
    public void setTemperature(int temperature) {
        log.info("The thermostat is set to " + temperature + " degrees.");
    }
}
